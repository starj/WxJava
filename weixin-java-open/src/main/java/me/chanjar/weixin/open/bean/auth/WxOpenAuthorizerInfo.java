package me.chanjar.weixin.open.bean.auth;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="https://github.com/007gzs">007</a>
 */
@Data
public class WxOpenAuthorizerInfo implements Serializable {
  private static final long serialVersionUID = -5327886953416394738L;

  private String nickName;
  private String headImg;
  private Integer serviceTypeInfo;
  private Integer verifyTypeInfo;
  private String userName;
  private String principalName;
  private Map<String, Integer> businessInfo;
  private String alias;
  private String qrcodeUrl;

  /**
   * 账号介绍
   */
  private String signature;

  /**
   * 可根据这个字段判断是否为小程序类型授权
   */
  private MiniProgramInfo miniProgramInfo;

  @Data
  public class MiniProgramInfo {
    private Integer visitStatus;
    /**
     * 小程序已设置的各个服务器域名
     */
    private Network network;
    private List<Category> categories;

    @Data
    public class Category {
      private String first;
      private String second;
    }

    @Data
    public class Network {
      private List<String> requestDomain;
      private List<String> wsRequestDomain;
      private List<String> uploadDomain;
      private List<String> downloadDomain;
    }
  }
}