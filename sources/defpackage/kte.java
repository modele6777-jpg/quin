package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kte implements l26 {
    public final /* synthetic */ int E0;
    public final /* synthetic */ int F0;
    public final /* synthetic */ int G0;
    public final /* synthetic */ CharSequence H0;
    public final /* synthetic */ Object I0;
    public final /* synthetic */ int X;
    public final /* synthetic */ a26 Y;
    public final /* synthetic */ mue Z;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ ar5 e;
    public final /* synthetic */ yp5 f;
    public final /* synthetic */ long g;
    public final /* synthetic */ jme v;
    public final /* synthetic */ long w;
    public final /* synthetic */ int x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ int z;

    public /* synthetic */ kte(k00 k00Var, j09 j09Var, long j, long j2, ar5 ar5Var, yp5 yp5Var, long j3, jme jmeVar, long j4, int i, boolean z, int i2, int i3, Map map, a26 a26Var, mue mueVar, int i4, int i5, int i6) {
        this.H0 = k00Var;
        this.b = j09Var;
        this.c = j;
        this.d = j2;
        this.e = ar5Var;
        this.f = yp5Var;
        this.g = j3;
        this.v = jmeVar;
        this.w = j4;
        this.x = i;
        this.y = z;
        this.z = i2;
        this.X = i3;
        this.I0 = map;
        this.Y = a26Var;
        this.Z = mueVar;
        this.E0 = i4;
        this.F0 = i5;
        this.G0 = i6;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.F0;
        int i3 = this.E0;
        Object obj3 = this.I0;
        CharSequence charSequence = this.H0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i3 | 1);
                int iP2 = k99.P(i2);
                nte.b((String) charSequence, this.b, this.c, this.d, this.e, this.f, this.g, (mne) obj3, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, (l46) obj, iP, iP2, this.G0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(i3 | 1);
                int iP4 = k99.P(i2);
                nte.c((k00) charSequence, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, (Map) obj3, this.Y, this.Z, (l46) obj, iP3, iP4, this.G0);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ kte(String str, j09 j09Var, long j, long j2, ar5 ar5Var, yp5 yp5Var, long j3, mne mneVar, jme jmeVar, long j4, int i, boolean z, int i2, int i3, a26 a26Var, mue mueVar, int i4, int i5, int i6) {
        this.H0 = str;
        this.b = j09Var;
        this.c = j;
        this.d = j2;
        this.e = ar5Var;
        this.f = yp5Var;
        this.g = j3;
        this.I0 = mneVar;
        this.v = jmeVar;
        this.w = j4;
        this.x = i;
        this.y = z;
        this.z = i2;
        this.X = i3;
        this.Y = a26Var;
        this.Z = mueVar;
        this.E0 = i4;
        this.F0 = i5;
        this.G0 = i6;
    }
}
