package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vr1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vr1(float f, a26 a26Var, b62 b62Var, a26 a26Var2, int i) {
        this.a = 0;
        this.b = f;
        this.c = a26Var;
        this.e = b62Var;
        this.d = a26Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(24583);
                gs1.j(this.b, (a26) obj5, (b62) obj3, (a26) obj4, (l46) obj, iP);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(7);
                gs1.f((String) obj4, this.b, (a26) obj5, (j09) obj3, (l46) obj, iP2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP3 = k99.P(1);
                kj0.k((mic) obj5, (qs5) obj4, this.b, (j09) obj3, (l46) obj, iP3);
                break;
            case 3:
                jmb jmbVar = (jmb) obj4;
                t91 t91Var = (t91) obj3;
                a26 a26Var = (a26) obj5;
                float fFloatValue = ((Float) obj2).floatValue();
                ((oia) obj).getClass();
                float f = jmbVar.element + fFloatValue;
                jmbVar.element = f;
                t91 t91Var2 = t91.b;
                float f2 = this.b;
                t91 t91Var3 = t91.a;
                if (t91Var == t91Var3 && f > f2) {
                    a26Var.d(t91Var2);
                    jmbVar.element = 0.0f;
                } else if (t91Var == t91Var2 && f < (-f2)) {
                    a26Var.d(t91Var3);
                    jmbVar.element = 0.0f;
                }
                break;
            default:
                ((Integer) obj2).getClass();
                int iP4 = k99.P(1);
                h4g.g((qhe) obj5, (TarotSkinIdentify) obj4, this.b, (j09) obj3, (l46) obj, iP4);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ vr1(jmb jmbVar, t91 t91Var, float f, a26 a26Var) {
        this.a = 3;
        this.d = jmbVar;
        this.e = t91Var;
        this.b = f;
        this.c = a26Var;
    }

    public /* synthetic */ vr1(Object obj, Enum r2, float f, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = r2;
        this.b = f;
        this.e = j09Var;
    }

    public /* synthetic */ vr1(String str, float f, a26 a26Var, j09 j09Var, int i) {
        this.a = 1;
        this.d = str;
        this.b = f;
        this.c = a26Var;
        this.e = j09Var;
    }
}
