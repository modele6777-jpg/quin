package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d47 {
    public final /* synthetic */ int a;
    public final rq6 b;
    public final rq6 c;
    public final rq6 d;
    public final rq6 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public d47(d47[] d47VarArr) {
        final int i = 0;
        this.a = 0;
        this.f = d47VarArr;
        int length = d47VarArr.length;
        final rq6[] rq6VarArr = new rq6[length];
        for (int i2 = 0; i2 < length; i2++) {
            rq6VarArr[i2] = ((d47[]) this.f)[i2].b();
        }
        final int i3 = 1;
        this.b = new rq6(1, new l26() { // from class: wtf
            @Override // defpackage.l26
            public final Object z(Object obj, Object obj2) {
                float fM;
                int i4 = i3;
                rq6[] rq6VarArr2 = rq6VarArr;
                bea beaVar = (bea) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        fM = z7c.m(beaVar, false, rq6VarArr2, fFloatValue);
                        break;
                    default:
                        fM = z7c.m(beaVar, true, rq6VarArr2, fFloatValue);
                        break;
                }
                return Float.valueOf(fM);
            }
        });
        int length2 = ((d47[]) this.f).length;
        final rq6[] rq6VarArr2 = new rq6[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            rq6VarArr2[i4] = ((d47[]) this.f)[i4].d();
        }
        this.c = new rq6(0, new l26() { // from class: qq6
            @Override // defpackage.l26
            public final Object z(Object obj, Object obj2) {
                float fM;
                int i5 = i3;
                rq6[] rq6VarArr3 = rq6VarArr2;
                bea beaVar = (bea) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i5) {
                    case 0:
                        fM = z7c.m(beaVar, false, rq6VarArr3, fFloatValue);
                        break;
                    default:
                        fM = z7c.m(beaVar, true, rq6VarArr3, fFloatValue);
                        break;
                }
                return Float.valueOf(fM);
            }
        });
        int length3 = ((d47[]) this.f).length;
        final rq6[] rq6VarArr3 = new rq6[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            rq6VarArr3[i5] = ((d47[]) this.f)[i5].c();
        }
        this.d = new rq6(1, new l26() { // from class: wtf
            @Override // defpackage.l26
            public final Object z(Object obj, Object obj2) {
                float fM;
                int i6 = i;
                rq6[] rq6VarArr4 = rq6VarArr3;
                bea beaVar = (bea) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i6) {
                    case 0:
                        fM = z7c.m(beaVar, false, rq6VarArr4, fFloatValue);
                        break;
                    default:
                        fM = z7c.m(beaVar, true, rq6VarArr4, fFloatValue);
                        break;
                }
                return Float.valueOf(fM);
            }
        });
        int length4 = ((d47[]) this.f).length;
        final rq6[] rq6VarArr4 = new rq6[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            rq6VarArr4[i6] = ((d47[]) this.f)[i6].a();
        }
        this.e = new rq6(0, new l26() { // from class: qq6
            @Override // defpackage.l26
            public final Object z(Object obj, Object obj2) {
                float fM;
                int i7 = i;
                rq6[] rq6VarArr5 = rq6VarArr4;
                bea beaVar = (bea) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i7) {
                    case 0:
                        fM = z7c.m(beaVar, false, rq6VarArr5, fFloatValue);
                        break;
                    default:
                        fM = z7c.m(beaVar, true, rq6VarArr5, fFloatValue);
                        break;
                }
                return Float.valueOf(fM);
            }
        });
    }

    public final rq6 a() {
        int i = this.a;
        return this.e;
    }

    public final rq6 b() {
        int i = this.a;
        return this.b;
    }

    public final rq6 c() {
        int i = this.a;
        return this.d;
    }

    public final rq6 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return qd0.t0((d47[]) obj, null, "innermostOf(", ")", null, 57);
            default:
                return ib8.j("RectRulers(", (String) obj, ")");
        }
    }

    public d47(String str) {
        this.a = 1;
        this.f = str;
        this.b = new rq6(1, null);
        this.c = new rq6(0, null);
        this.d = new rq6(1, null);
        this.e = new rq6(0, null);
    }
}
