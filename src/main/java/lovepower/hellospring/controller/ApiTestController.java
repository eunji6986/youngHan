package lovepower.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class ApiTestController {

    @ResponseBody
    @GetMapping
    public helloApi APItestCont(@RequestParam("testabc") String testabc){
        helloApi okbye = new helloApi();
        okbye.setTestabc(testabc);
        return okbye;
    }

    static class helloApi{
        private String testabc;

        public String getTestabc() {
            return testabc;
        }

        public void setTestabc(String testabc) {
            this.testabc = testabc;
        }
    }

    @GetMapping
    @ResponseBody
    public oneMore oneMoreTest(@RequestParam("moremore") String moremore){
        oneMore om = new oneMore();

        om.setMoremore(moremore);
        return om;
    }

    static class oneMore{
        private String moremore;

        public String getMoremore() {
            return moremore;
        }

        public void setMoremore(String moremore) {
            this.moremore = moremore;
        }
    }

    static class twoMore{
        private int two;

        public int getTwo() {
            return two;
        }

        public void setTwo(int two) {
            this.two = two;
        }
    }

    @ResponseBody
    @GetMapping
    public twoMore testHard(@RequestParam("two") int two){
        twoMore tm = new twoMore();
        tm.setTwo(two);
        return tm;

    }

}
