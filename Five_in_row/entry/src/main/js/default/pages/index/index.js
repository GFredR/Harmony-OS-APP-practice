import prompt from "@system.prompt"
import router from '@system.router'
import fetch from '@system.fetch'
export default {
    data: {
        title: ""
    },
    getData() {
        fetch.fetch({
            url: 'http://www.path.com',
            responseType: 'text',
            success: function(response) {
                console.log('response code:' + response.code);
                console.log('response data:' + response.data);
            },
            fail: function(data, code) {
                console.log('fail callback');
            },
        });
    },
    go() {
        router.push({
            uri: 'pages/chess/chess'
        });
    },
    onInit() {
        this.title = this.$t('strings.world');
    }
}
