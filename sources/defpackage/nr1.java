package defpackage;

import ai.askquin.ui.draw.photo.homepage.CardLayoutConfig;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nr1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nr1(Object obj, int i, int i2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.c;
        int i3 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                gs1.h((CardLayoutConfig) obj3, i3, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jgb.p((fbf) obj3, (l46) obj, k99.P(i3 | 1), i2);
                break;
        }
        return wefVar;
    }
}
