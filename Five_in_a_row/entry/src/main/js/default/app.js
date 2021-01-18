import tool from "./tool.js"

export default {
    onCreate() {
        tool.getDayInfo()
        console.info('AceApplication onCreate');
    },
    onDestroy() {
        console.info('AceApplication onDestroy');
    }
};
