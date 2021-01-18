import router from '@system.router';
//import index from
export default {
    data: {
        title: "是是是",
        products: [
            "apple",
            "sumsung",
            "HuaWei"
        ],
        isDisplay: false
    },
    show() {
//        router.push({
//            uri: '/NextPage/pages/index/index.hml'
//        })
        this.isDisplay = !this.isDisplay;
    },
    onInit() {
        this.title = this.$t('strings.world');
    }
}
