package defpackage;

import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t43 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ t43(boolean z, boolean z2, y72 y72Var, y72 y72Var2, int i, int i2) {
        this.a = 4;
        this.b = z;
        this.c = z2;
        this.e = y72Var;
        this.f = y72Var2;
        this.d = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        wef wefVar = wef.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                b53.g((DailyCardBasicInfo) obj4, this.b, this.c, (a26) obj3, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                no6.a((z63) obj4, this.b, this.c, (j09) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                beb.f((TarotCardChoice) obj4, this.b, this.c, (l26) obj3, (l46) obj, iP3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(i2 | 1);
                d8c.k((String) obj4, this.b, this.c, (x16) obj3, (l46) obj, iP4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(1);
                zyf.a(this.b, this.c, (y72) obj4, (y72) obj3, (l46) obj, iP5, this.d);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ t43(Object obj, boolean z, boolean z2, Object obj2, int i, int i2) {
        this.a = i2;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.f = obj2;
        this.d = i;
    }
}
