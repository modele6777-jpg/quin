package defpackage;

import ai.askquin.model.Scene;
import ai.askquin.ui.conversation.dialogue.NewReadingState;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i30 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i30(ale aleVar, j09 j09Var, boolean z, int i) {
        this.a = 10;
        this.d = aleVar;
        this.e = j09Var;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.b;
        wef wefVar = wef.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m93.i((k40) obj4, z, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                if9.a((c4c) obj4, z, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                lt2.e((c31) obj4, z, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                b53.b((DailyCardBasicInfo) obj4, z, (a26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                rs0.a(iP, (dd2) obj4, (l46) obj, (j09) obj3, z);
                break;
            case 5:
                ((Integer) obj2).intValue();
                abg.g((NewReadingState) obj4, z, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                no6.o((Scene) obj4, z, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(1);
                tm7.f(this.b, this.c, (String) obj4, (String) obj3, (l46) obj, iP2);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                v2c.d(iP3, (x16) obj3, (l46) obj, (String) obj4, z);
                break;
            case 9:
                ((Integer) obj2).getClass();
                zrc.a(z, (y6c) obj4, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                dxd.b((ale) obj4, (j09) obj3, z, (l46) obj, k99.P(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                aic.b(z, (txb) obj4, (cre) obj3, (l46) obj, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ i30(Object obj, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.c = i;
    }

    public /* synthetic */ i30(boolean z, int i, String str, String str2, int i2) {
        this.a = 7;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    public /* synthetic */ i30(boolean z, j09 j09Var, dd2 dd2Var, int i) {
        this.a = 4;
        this.b = z;
        this.e = j09Var;
        this.d = dd2Var;
        this.c = i;
    }

    public /* synthetic */ i30(boolean z, Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = i;
    }
}
