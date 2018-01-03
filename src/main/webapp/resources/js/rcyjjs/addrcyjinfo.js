$('#rcyjsubmit').click(
    function () {
       //        var fullName = $("#name").val();


        //获取性别radio选项
        var radio = document.getElementsByName("sex");
        for (i=0; i<radio.length; i++) {
            if (radio[i].checked) {
                var gender=radio[i].value;
            }
        }
        var fullName = document.getElementById("name").value;
        var nativePlace = document.getElementById("native").value;
        var nation = document.getElementById("native").value;
        var dateOfBirth = document.getElementById("birthday").value;
        var nationality = document.getElementById("nationality").value;
        var politicalStatus = document.getElementById("policy").value;
        var healthCondition = document.getElementById("health").value;
        var maritalCondition = document.getElementById("marry").value;
        var height = document.getElementById("height").value;
        var highestEducation = document.getElementById("learn").value;
        var foreignLanguageSituation = document.getElementById("language").value;
        var contactInfo = document.getElementById("phone").value;
        var IDCardNo = document.getElementById("id_card").value;
        var application = document.getElementById("job").value;
        var locationOfFile = document.getElementById("place").value;
        var education='' ;
        var experience = '';

        //查找有几条教育经历
        var i=1;
       for(i;i<6;i++) {
           var flag="learn_start_end_time"+i.toString();

           if(document.getElementById(flag).value==''||document.getElementById(flag).value==null||document.getElementById(flag).value==undefined )
               break;
       }
       //将教育经历合并
       for(var j=1;j<i;j++)
       {    var learn_start_end_time="learn_start_end_time"+j.toString();
           var school="school"+j.toString();
           var major="major"+j.toString();
           var teacher="teacher"+j.toString();
           var degree_way="degree_way"+j.toString();
           education= education+document.getElementById(learn_start_end_time).value+"*"+document.getElementById(school).value+"*"+document.getElementById(major).value+"*"+document.getElementById(teacher).value+"*"+document.getElementById(degree_way).value+"#";
       }


        //查找有几条工作经历
        var jobnum=1;
        for(jobnum;jobnum<7;jobnum++) {
            var flagjob="job_start_end_time"+jobnum.toString();

            if(document.getElementById(flagjob).value==''||document.getElementById(flagjob).value==null||document.getElementById(flagjob).value==undefined )
                break;
        }
        //将工作经历合并
        for(var j=1;j<jobnum;j++) {
            var job_start_end_time = "job_start_end_time" + j.toString();
            var unit = "unit" + j.toString();
            var technical = "technical" + j.toString();
            var policy_job = "policy_job" + j.toString();
            experience = experience + document.getElementById(job_start_end_time).value + "*" + document.getElementById(unit).value + "*" + document.getElementById(technical).value + "*" + document.getElementById(policy_job).value + "#";
        }
        // alert(education);
        // alert(experience);



        var host = window.location.host;
        //获取主机
        var url = "http://"+host+"/rcyjinfo/addRcyjinfo";
        $.ajax({
            type: "get",
            url: url,
            data:{fullName: fullName, gender: gender,nativePlace: nativePlace, nation: nation, dateOfBirth:dateOfBirth, nationality:nationality,politicalStatus: politicalStatus,
                healthCondition: healthCondition,maritalCondition: maritalCondition, height: height,highestEducation: highestEducation, foreignLanguageSituation: foreignLanguageSituation,
                contactInfo: contactInfo, IDCardNo: IDCardNo,application: application, locationOfFile: locationOfFile,education: education, experience: experience},
            dataType: "json",
            success: function (returnMap) {
                if (returnMap.success) {
                    alert("提交成功");
                    window.location.reload();
                } else {
                    alert("服务器忙，请稍后重试！");
                    window.location.reload();
                }
            }
        })
    }
)