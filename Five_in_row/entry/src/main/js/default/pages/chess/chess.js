export default {
    data: {
        cxt: "",
        wins: [],
        count: 0,
        chessBoard: [],
        me: true,
        over: false,
    },
    onInit() {
        this.initArr();
        this.initChessBoard();
    },
    initChessBoard() {
        for (let i = 0; i < 15; i++) {
            this.chessBoard[i] = [];
            for (let j = 0; j < 15; j++) {
                this.chessBoard[i][j] = 0;
            }
        }
    },
    initArr() {
        for (let i = 0; i < 15; i++) {
            this.wins[i] = [];
            for (let j = 0; j < 15; j++) {
                this.wins[i][j] = [];
            }
        }

        for (let i = 0; i < 15; i++) {
            for (let j = 0; j < 11; j++) {
                for (let k = 0; k < 5; k++) {
                    this.wins[j+k][i][this.count]=true;
                }
                this.count++;
            }
        }

        for (let i = 0; i < 11; i++) {
            for (let j = 0; j < 11; j++) {
                for (let k = 0; k < 5; k++) {
                    this.wins[j+k][i][this.count]=true;
                }
                this.count++;
            }
        }
    },
    onShow() {
        this.drawChessBoard();
    },
    drawChessBoard() {
        this.cxt = this.$refs.chess.getContext("2d");
        const ROW = 15;
        const WIDTH = 50;
        for(var i=0;i<ROW;i++) {
            this.cxt.moveTo(ROW, ROW+i*WIDTH);
            this.cxt.lineTo(710, ROW+i*WIDTH);
            this.cxt.stroke();

            this.cxt.moveTo(ROW+i*WIDTH, ROW);
            this.cxt.lineTo(ROW+i*WIDTH, 710);
            this.cxt.stroke();
        }
//
    },
    onPressChess(e) {
        if (this.over) {
            return;
        }
        if (!this.me) {
            return;
        }
        let x = Math.floor(e.touches[0].localX / 30);
        let y = Math.floor(e.touches[0].localY / 30);

        if (this.chessBoard[x][y] == 0) {
            this.chessBoard[x][y] == 1;
            this.drawChess(x, y);
        }
    },
    drawChess(x, y) {
        this.cxt.beginPath();
        this.cxt.arc(15 + x * 50, 15 + y * 50, 13, 0, 6.28);
        this.cxt.closePath();
        if (!this.me) {
            this.cxt.fillStyle = "white";
        }
        this.cxt.fill();
    }
}
