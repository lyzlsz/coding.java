package com.store.frank.model;

import lombok.Data;

/**
 * @author zhangmingming  braveheart1115@163.com
 * @date 2019年07月25日 17:58
 * @Description: 人脸检测显示的属性。
 */
@Data
public class FaceModel {
    private Integer age; // 年龄
    private Integer beauty; // 颜值
    private String expression; // 表情
    private String faceShape; // 脸型
    private String gender; // 性别
    private String glasses; // 是否带有眼镜
    private String race; // 人种
}
