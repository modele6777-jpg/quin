package defpackage;

import tech.chatmind.api.ReadingFeedbackTag;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k28 implements l26 {
    public final /* synthetic */ int a = 5;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ k28(int i, int i2, boolean z, boolean z2, x16 x16Var, x16 x16Var2, x16 x16Var3, int i3) {
        this.e = i;
        this.f = i2;
        this.b = z;
        this.d = z2;
        this.c = x16Var;
        this.g = x16Var2;
        this.v = x16Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        wef wefVar = wef.a;
        Object obj3 = this.v;
        Object obj4 = this.g;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                ym8.h((j09) obj4, this.b, (String) obj3, this.d, (x16) obj5, (l46) obj, iP, this.f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                ynb.g((cwa) obj4, this.b, (x16) obj5, this.d, (x16) obj3, (l46) obj, iP2, this.f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i2 | 1);
                jfb.a((ReadingFeedbackTag) obj3, this.b, this.d, (x16) obj5, (j09) obj4, (l46) obj, iP3, this.f);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(1572865);
                p8c.c((egd) obj4, this.e, (jp1) obj3, this.f, this.b, this.d, (a26) obj5, (l46) obj, iP4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iP5 = k99.P(i2 | 1);
                wbe.a(this.b, (a26) obj3, (j09) obj4, this.d, (vbe) obj5, (l46) obj, iP5, this.f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP6 = k99.P(1);
                iec.d(this.e, this.f, this.b, this.d, (x16) obj5, (x16) obj4, (x16) obj3, (l46) obj, iP6);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ k28(j09 j09Var, boolean z, String str, boolean z2, x16 x16Var, int i, int i2) {
        this.g = j09Var;
        this.b = z;
        this.v = str;
        this.d = z2;
        this.c = x16Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ k28(cwa cwaVar, boolean z, x16 x16Var, boolean z2, x16 x16Var2, int i, int i2) {
        this.g = cwaVar;
        this.b = z;
        this.c = x16Var;
        this.d = z2;
        this.v = x16Var2;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ k28(egd egdVar, int i, jp1 jp1Var, int i2, boolean z, boolean z2, a26 a26Var, int i3) {
        this.g = egdVar;
        this.e = i;
        this.v = jp1Var;
        this.f = i2;
        this.b = z;
        this.d = z2;
        this.c = a26Var;
    }

    public /* synthetic */ k28(ReadingFeedbackTag readingFeedbackTag, boolean z, boolean z2, x16 x16Var, j09 j09Var, int i, int i2) {
        this.v = readingFeedbackTag;
        this.b = z;
        this.d = z2;
        this.c = x16Var;
        this.g = j09Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ k28(boolean z, a26 a26Var, j09 j09Var, boolean z2, vbe vbeVar, int i, int i2) {
        this.b = z;
        this.v = a26Var;
        this.g = j09Var;
        this.d = z2;
        this.c = vbeVar;
        this.e = i;
        this.f = i2;
    }
}
