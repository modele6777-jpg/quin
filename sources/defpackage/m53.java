package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m53 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m53(int i, String str, kx4 kx4Var) {
        this.a = 1;
        this.b = i;
        this.c = str;
        this.d = kx4Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj = this.d;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ynb.V((aw2) obj2, null, null, new p53((cs3) obj, i2, null), 3);
                return wefVar;
            case 1:
                String str = (String) obj2;
                kx4 kx4Var = (kx4) obj;
                nyc[] nycVarArr = new nyc[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    nycVarArr[i3] = eec.q(str + '.' + kx4Var.e[i3], g5e.f, new nyc[0]);
                }
                return nycVarArr;
            case 2:
                ynb.V((aw2) obj2, null, null, new wb5((a26) obj, i2, null), 3);
                return wefVar;
            case 3:
                ds6 ds6Var = (ds6) obj2;
                try {
                    ds6Var.L0.G(i2, (ay4) obj);
                    break;
                } catch (IOException e) {
                    ay4 ay4Var = ay4.PROTOCOL_ERROR;
                    ds6Var.b(ay4Var, ay4Var, e);
                }
                return wefVar;
            case 4:
                ynb.V((aw2) obj2, null, null, new wld((yx9) obj, i2, null), 3);
                return wefVar;
            default:
                vad vadVar = (vad) obj2;
                x16 x16Var = (x16) obj;
                u6d u6dVar = (u6d) vadVar.c.b;
                if (u6dVar == null) {
                    u6dVar = u6d.TapScrim;
                }
                vadVar.a(i2, u6dVar, x16Var);
                return wefVar;
        }
    }

    public /* synthetic */ m53(aw2 aw2Var, Object obj, int i, int i2) {
        this.a = i2;
        this.c = aw2Var;
        this.d = obj;
        this.b = i;
    }

    public /* synthetic */ m53(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
