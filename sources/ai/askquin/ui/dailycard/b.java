package ai.askquin.ui.dailycard;

import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements x16 {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return DailyCardShareRoute._childSerializers$_anonymous_();
            case 1:
                return DailyCardShareRoute._childSerializers$_anonymous_$0();
            case 2:
                return DailyCardShareRoute._childSerializers$_anonymous_$1();
            default:
                return DailyCardShuffleRoute._init_$_anonymous_();
        }
    }
}
