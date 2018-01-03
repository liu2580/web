package com.jskj.ssm.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapper {

    private String url="jdbc:mysql://localhost:3306/db_ssm";
    private String DBName = "root";
    private String DBPassword = "123";


    //根据新闻类型查询首页显示的标题以及时间 Id  要闻快递 8条
    public List<Map<String,Object>> newsShowUs()
    {
        List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artType=? order by artDate DESC limit 8  ";
                ps = conn.prepareStatement(sql);
               ps.setString(1, "要闻快递");

                rs = ps.executeQuery();
                while(rs.next())
                {
                    Map<String,Object> temmap = new HashMap<String,Object>();
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));
                    temmap.put("date", rs.getString("artDate"));
                   // temmap.put("content", rs.getString("artText"));
                  //  temmap.put("author", rs.getString("artAuthor"));
                  //  temmap.put("editor", rs.getString("artEditor"));

                    listMap.add(temmap);
                }

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }



        return listMap;
    }



    //通过新闻编号查询新闻具体信息  并更新阅读次数
    public Map<String,Object> newsAdSeById(Map<String,Object> map)
    {
        Map<String,Object> temmap = new HashMap<String,Object>();
        Connection conn = null;
        PreparedStatement ps = null;
        PreparedStatement ps1 = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artId = ?";
                ps = conn.prepareStatement(sql);
                String sql1 = "update articles set artReadNum = ? where artId = ?";
                ps1 = conn.prepareStatement(sql1);

                ps.setInt(1, Integer.parseInt(map.get("id").toString()));
                rs = ps.executeQuery();
                while(rs.next())
                {
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));
                    temmap.put("content", rs.getString("artText"));
                    temmap.put("date", rs.getString("artDate"));
                    temmap.put("type", rs.getString("artType"));
                    temmap.put("author", rs.getString("artAuthor"));
                    temmap.put("editor", rs.getString("artEditor"));
                    temmap.put("readNum", rs.getString("artReadNum"));
                }

                int readNum=Integer.parseInt(temmap.get("readNum").toString())+1;
                ps1.setInt(1, readNum);
                ps1.setInt(2, Integer.parseInt(temmap.get("id").toString()));
                ps1.executeUpdate();

            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                    ps1.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }




        return temmap;
    }




    //根据新闻类型查询首页显示的标题以及时间 Id 市县研究中心  6条
    public List<Map<String,Object>> newsShowSXyjzx()
    {
        List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artType=? order by artDate DESC limit 6 ";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "市县研究中心");

                rs = ps.executeQuery();
                while(rs.next())
                {
                    Map<String,Object> temmap = new HashMap<String,Object>();
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));
                    temmap.put("date", rs.getString("artDate"));

                    listMap.add(temmap);
                }

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }



        return listMap;
    }



    //获取特别关注
    public Map<String,Object> Gettebieguanzhu(Map<String,Object> map)
    {
        Map<String,Object> temmap = new HashMap<String,Object>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artType = ? order by artDate DESC ";
                ps = conn.prepareStatement(sql);
                ps.setString(1,map.get("artType1").toString());
                rs = ps.executeQuery();
                while(rs.next())
                {
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));
                    temmap.put("content", rs.getString("artText"));
//                    temmap.put("date", rs.getString("artDate"));
//                    //  temmap.put("type", rs.getString("artType"));
//                    temmap.put("author", rs.getString("artAuthor"));
//                    temmap.put("editor", rs.getString("artEditor"));
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        return temmap;
    }


    //获取深化改革
    public Map<String,Object> Getshenhuagaige(Map<String,Object> map)
    {
        Map<String,Object> temmap = new HashMap<String,Object>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artType = ? order by artDate DESC ";
                ps = conn.prepareStatement(sql);
                ps.setString(1,map.get("artType2").toString());
                rs = ps.executeQuery();
                while(rs.next())
                {
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));
                    temmap.put("content", rs.getString("artText"));
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        return temmap;
    }


    //获取头条新闻
    public Map<String,Object> Gettoutiaoxinwen(Map<String,Object> map)
    {
        Map<String,Object> temmap = new HashMap<String,Object>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artType = ? order by artDate DESC";
                ps = conn.prepareStatement(sql);
                ps.setString(1,map.get("artType3").toString());
                rs = ps.executeQuery();
                while(rs.next())
                {
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));
                }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

        return temmap;
    }

    //根据新闻类型查询首页显示的标题Id 通知公告  5条
    public List<Map<String,Object>> GetTongzhigg()
    {
        List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artType=? order by artDate DESC limit 5 ";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "通知公告");

                rs = ps.executeQuery();
                while(rs.next())
                {
                    Map<String,Object> temmap = new HashMap<String,Object>();
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));

                    listMap.add(temmap);
                }

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }



        return listMap;
    }



    //根据新闻类型查询首页显示的标题Id 活动预告  5条
    public List<Map<String,Object>> GetHuoDongyg()
    {
        List<Map<String,Object>> listMap = new ArrayList<Map<String,Object>>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, DBName, DBPassword);
            if(conn!=null)
            {
                String sql = "select * from articles where artType=? order by artDate DESC limit 5 ";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "活动预告");

                rs = ps.executeQuery();
                while(rs.next())
                {
                    Map<String,Object> temmap = new HashMap<String,Object>();
                    temmap.put("id", rs.getString("artId"));
                    temmap.put("title", rs.getString("artTitle"));

                    listMap.add(temmap);
                }

            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try
            {
                if(rs!=null)
                {
                    rs.close();
                }
                if(ps!=null)
                {
                    ps.close();
                }
                if(conn!=null)
                {
                    conn.close();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }



        return listMap;
    }



}
