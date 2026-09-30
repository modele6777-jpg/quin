package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t46 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ GaugeManager b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zb0 d;

    public /* synthetic */ t46(GaugeManager gaugeManager, String str, zb0 zb0Var, int i) {
        this.a = i;
        this.b = gaugeManager;
        this.c = str;
        this.d = zb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zb0 zb0Var = this.d;
        String str = this.c;
        GaugeManager gaugeManager = this.b;
        switch (i) {
            case 0:
                gaugeManager.lambda$stopCollectingGauges$3(str, zb0Var);
                break;
            default:
                gaugeManager.lambda$startCollectingGauges$2(str, zb0Var);
                break;
        }
    }
}
