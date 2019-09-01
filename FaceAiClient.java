package com.store.frank.utils;

import com.baidu.aip.face.AipFace;
import com.baidu.aip.face.MatchRequest;
import com.store.frank.model.FaceModel;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2019年07月25日 18:18
 * @Description: 百度人脸识别客户端
 * 参考地址 https://ai.baidu.com/docs#/Face-Java-SDK/a1e0679a
 */
public class FaceAiClient {

    /**
     * 百度智能云控制台 -->人脸识别 --> 创建应用。应用创建成功后，应用列表中对应的值。
     */
    private static final String APP_ID = "16871980";
    private static final String API_KEY = "o6CXOGXMHaZ1v2uNLewn0V59";
    private static final String SECRET_KEY = "iR3rhgqUNhD61zInO9CZ2twMlF5g4huY";

    /**
     * image_type：图像类型，取值如下：
     *  BASE64: 图片的base64值，base64编码后的图片数据，需urlencode，编码后的图片大小不超过2M；
     *  URL:图片的 URL地址( 可能由于网络等原因导致下载图片时间过长)；
     *  FACE_TOKEN: 人脸图片的唯一标识，调用人脸检测接口时，会为每个人脸图片赋予一个唯一的FACE_TOKEN，同一张图片多次检测得到的FACE_TOKEN是同一个
     */
    private static final String IMAGE_TYPE = "BASE64";

    // 百度人脸识别api接口。
    private final AipFace aipFace;

    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/26 16:26
     * @Description: AipFace 初始化
     */
    public FaceAiClient() {
        aipFace = new AipFace(APP_ID, API_KEY, SECRET_KEY);
        // 建立连接的超时时间（单位：毫秒）
        aipFace.setConnectionTimeoutInMillis(2000);
        // 通过打开的连接传输数据的超时时间（单位：毫秒）
        aipFace.setSocketTimeoutInMillis(60000);
    }

    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/26 16:03
     * @Description: 人脸识别方法，识别的属性有性别，年龄，肤色等。
     * json数据格式化 http://www.bejson.com/jsonviewernew/
     */
    public FaceModel detect(String imgBase64) {
        // 设置人脸属性
        HashMap<String, String> options = new HashMap<>();
        options.put("face_field", "age,beauty,expression,face_shape,gender,glasses,race,face_type");
        JSONObject jsonObject = aipFace.detect(imgBase64, IMAGE_TYPE, options);
        System.out.println("识别后的返回值为："+jsonObject.toString());
        // 3 处理返回值，将需要的属性设置到对象上。
        // 如果返回结果是正确的再进行处理，否则返回错误提示。
        String errorMsg=jsonObject.optString("error_msg");
        JSONObject faceObject=null;
        if("SUCCESS".equalsIgnoreCase(errorMsg)){
            JSONObject result = jsonObject.optJSONObject("result");
            if (result.optInt("face_num") == 1) {
                faceObject = (JSONObject) result.optJSONArray("face_list").get(0);
            }
        }
        FaceModel faceModel=new FaceModel();
        if(null != faceObject){
            faceModel=parseAttribute(faceObject);
        }
        return faceModel;
    }


    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/28 16:53
     * @Description: 解析返回对象，填充面部检测属性值。
     */
    private FaceModel parseAttribute(JSONObject faceObject) {
        FaceModel faceModel = new FaceModel();
        //表情
        String expression = faceObject.getJSONObject("expression").getString("type");
        switch (expression) {
            case "smile":
                faceModel.setExpression("微笑");
                break;
            case "laugh":
                faceModel.setExpression("大笑");
                break;
            case "none":
            default:
                faceModel.setExpression("无");
        }

        //脸型
        String faceShape = faceObject.getJSONObject("face_shape").getString("type");
        switch (faceShape) {
            case "square":
                faceModel.setFaceShape("正方形");
                break;
            case "triangle":
                faceModel.setFaceShape("三角形");
                break;
            case "oval":
                faceModel.setFaceShape("椭圆");
                break;
            case "heart":
                faceModel.setFaceShape("心形");
                break;
            case "round":
                faceModel.setFaceShape("圆形");
                break;
            default:
                faceModel.setFaceShape("未知");

        }

        //性别
        String gender = faceObject.getJSONObject("gender").getString("type");
        switch (gender) {
            case "male":
                faceModel.setGender("帅哥");
                break;
            case "female":
                faceModel.setGender("美女");
                break;
            default:
                faceModel.setGender("未知");
        }

        //人种
        String race = faceObject.getJSONObject("race").getString("type");
        switch (race) {
            case "yellow":
                faceModel.setRace("黄种人");
                break;
            case "white":
                faceModel.setRace("白种人");
                break;
            case "black":
                faceModel.setRace("黑种人");
                break;
            case "arabs":
                faceModel.setRace("阿拉伯人");
                break;
            default:
                faceModel.setRace("未知");
        }

        //眼镜
        String glasses = faceObject.getJSONObject("glasses").getString("type");
        switch (glasses) {
            case "common":
                faceModel.setGlasses("普通眼镜");
                break;
            case "sun":
                faceModel.setGlasses("墨镜");
                break;
            case "none":
                faceModel.setGlasses("无眼镜");
                break;
            default:
                faceModel.setGlasses("未知");
        }

        //年龄
        int age = faceObject.optInt("age");
        faceModel.setAge(age);

        //颜值
        Integer beauty = faceObject.getInt("beauty");
        faceModel.setBeauty(beauty);

        return faceModel;
    }

    /**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/26 15:37
     * @Description: 人脸对比方法
     * 调用对比方法的时候 MatchRequest 对象中的图片与图片类型必须一致。
     * public MatchRequest(String image, String imageType){...}
     */
    public Double match(String img1Base64, String img2Base64) {

        MatchRequest request1 = new MatchRequest(img1Base64, IMAGE_TYPE);
        MatchRequest request2 = new MatchRequest(img2Base64, IMAGE_TYPE);

        List<MatchRequest> requests = new ArrayList<MatchRequest>();
        requests.add(request1);
        requests.add(request2);
        JSONObject jsonObject = aipFace.match(requests);

        System.out.println("对比后的返回值为:"+jsonObject.toString());
        // 调用接口时候的返回值
        String errorMsg=jsonObject.optString("error_msg");
        //对比后的匹配值
        Double result=null;
        if("SUCCESS".equalsIgnoreCase(errorMsg)){
        //表示对比成功，返回对比后的值
            result=jsonObject.optJSONObject("result").optDouble("score");
        }
        return result;
    }













/*
    *//**
     * @author zhangmingming  braveheart1115@163.com
     * @date 2019/7/26 15:23
     * @Description: 使用Base64对图片进行编码，返回图片的base64值。
     *//*
    private String bytesToBase64(byte[] data) {
        if (null== data) {
            data = new byte[]{};
        }
        return Base64.getEncoder().encodeToString(data);
    }*/


}
