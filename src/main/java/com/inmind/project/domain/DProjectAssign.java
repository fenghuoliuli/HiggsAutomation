package com.inmind.project.domain;

import com.inmind.mybatis.entity.ProjectAssignPO;

/**
 * Created by zhao on 2017/2/23.
 */
public class DProjectAssign extends ProjectAssignPO {
  /*private String displayName;

  public static Integer getProjectRole(String projectRole) {
    Integer result = 0;

    if (Constants.ProjectRoleType.C.equals(projectRole)) {
      result = 1;
    } else if (Constants.ProjectRoleType.CW.equals(projectRole)) {
      result = 2;
    } else if (Constants.ProjectRoleType.C_CW.equals(projectRole)) {
      result = 3;
    } else if (Constants.ProjectRoleType.DIRECTOR.equals(projectRole)) {
      result = 4;
    }
    return result;
  }

  public static String getProjectRole(Integer projectRole) {
    String result = "";
    if (projectRole != null) {
      if (projectRole == 1) {
        result = Constants.ProjectRoleType.C;
      } else if (projectRole == 2) {
        result = Constants.ProjectRoleType.CW;
      } else if (projectRole == 3) {
        result = Constants.ProjectRoleType.C_CW;
      } else if (projectRole == 4) {
        result = Constants.ProjectRoleType.DIRECTOR;
      }
    }

    return result;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  */
}
