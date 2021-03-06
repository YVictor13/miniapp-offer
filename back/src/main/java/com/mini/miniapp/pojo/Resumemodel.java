package com.mini.miniapp.pojo;

import javax.persistence.*;

public class Resumemodel {
    /**
     * 简历模板自身id
     */
    @Id
    private Integer id;

    /**
     * 模板类型(经典，简约，)
     */
    @Column(name = "resume_type")
    private String resumeType;

    /**
     * 适合人群(0实习生，2兼职生，1全职生)
     */
    @Column(name = "fit_crowd")
    private Integer fitCrowd;

    /**
     * 模板url
     */
    @Column(name = "model_url")
    private String modelUrl;

    /**
     * 模板缩放图像
     */
    @Column(name = "model_img")
    private String modelImg;

    /**
     * 获取简历模板自身id
     *
     * @return id - 简历模板自身id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置简历模板自身id
     *
     * @param id 简历模板自身id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取模板类型(经典，简约，)
     *
     * @return resume_type - 模板类型(经典，简约，)
     */
    public String getResumeType() {
        return resumeType;
    }

    /**
     * 设置模板类型(经典，简约，)
     *
     * @param resumeType 模板类型(经典，简约，)
     */
    public void setResumeType(String resumeType) {
        this.resumeType = resumeType;
    }

    /**
     * 获取适合人群(0实习生，2兼职生，1全职生)
     *
     * @return fit_crowd - 适合人群(0实习生，2兼职生，1全职生)
     */
    public Integer getFitCrowd() {
        return fitCrowd;
    }

    /**
     * 设置适合人群(0实习生，2兼职生，1全职生)
     *
     * @param fitCrowd 适合人群(0实习生，2兼职生，1全职生)
     */
    public void setFitCrowd(Integer fitCrowd) {
        this.fitCrowd = fitCrowd;
    }

    /**
     * 获取模板url
     *
     * @return model_url - 模板url
     */
    public String getModelUrl() {
        return modelUrl;
    }

    /**
     * 设置模板url
     *
     * @param modelUrl 模板url
     */
    public void setModelUrl(String modelUrl) {
        this.modelUrl = modelUrl;
    }

    /**
     * 获取模板缩放图像
     *
     * @return model_img - 模板缩放图像
     */
    public String getModelImg() {
        return modelImg;
    }

    /**
     * 设置模板缩放图像
     *
     * @param modelImg 模板缩放图像
     */
    public void setModelImg(String modelImg) {
        this.modelImg = modelImg;
    }
}