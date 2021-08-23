public class Page {
    private String url;
    private String proxy;

    public String getUrl(){
        return this.url;
    }
    public String getProxy(){
        return this.proxy;
    }

    public static class Builder{
        private Page newPage;

        public Builder(){
            newPage = new Page();
        }
        public Builder withUrl(String url){
            newPage.url=url;
            return this;
        }
        public Builder withProxy(String proxy){
            newPage.proxy=proxy;
            return this;
        }
        public Page build(){
            return newPage;
        }
    }

}
