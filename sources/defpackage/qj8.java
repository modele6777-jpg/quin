package defpackage;

import ai.askquin.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj8 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ qj8(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        String strD;
        String str;
        int i = this.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                int i2 = MainActivity.Z0;
                mainActivity.d().e("Current locale: ".concat(vd8.a()));
                return Boolean.valueOf("zh-CN".equalsIgnoreCase(vd8.a()) || "zh".equalsIgnoreCase(vd8.a()));
            default:
                ca2.a.getClass();
                if (ca2.c) {
                    strD = vd8.d();
                    str = "https://quin.love/privacy-terms?lang=";
                } else {
                    strD = vd8.d();
                    str = "https://quin.love/privacy-cn?lang=";
                }
                kn2.z(mainActivity, ib8.j(str, strD, "&ap=android&av=5.23.0"));
                return wef.a;
        }
    }
}
