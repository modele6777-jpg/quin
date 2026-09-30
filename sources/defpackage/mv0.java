package defpackage;

import ai.askquin.ui.divination.k;
import android.content.Intent;
import android.database.SQLException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv0 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mv0(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.x16
    public final Object invoke() throws Exception {
        b89 b89VarI;
        Intent intent;
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        Object obj = this.c;
        boolean z2 = this.b;
        switch (i) {
            case 0:
                b89 b89Var = (b89) obj;
                if (z2) {
                    b89Var.i(wefVar);
                }
                return wefVar;
            case 1:
                bv7 bv7Var = ((bv7[]) obj)[0];
                if (bv7Var == null) {
                    return null;
                }
                if (!bv7Var.h()) {
                    bv7Var = null;
                }
                if (bv7Var != null) {
                    return vt1.b(bv7Var, z2);
                }
                return null;
            case 2:
                ek2 ek2Var = (ek2) obj;
                String str = z2 ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                ek2Var.b.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                ek2Var.a.d(sb);
                try {
                    p8c.x(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    e.printStackTrace();
                    return wefVar;
                }
            case 3:
                ys ysVar = (ys) obj;
                if (z2 && (b89VarI = ysVar.i()) != null) {
                    ((ncd) b89VarI).i(wefVar);
                }
                return wefVar;
            case 4:
                fo5 fo5Var = (fo5) obj;
                if (z2) {
                    fo5.a(fo5Var);
                }
                return wefVar;
            case 5:
                return Boolean.valueOf(z2 && k.k((List) obj));
            case 6:
                ((ufb) obj).c = z2;
                return wefVar;
            case 7:
                ((lhb) obj).c.setValue(Boolean.valueOf(z2));
                return wefVar;
            case 8:
                vb2 vb2Var = (vb2) obj;
                if (!z2 && (vb2Var == null || (intent = vb2Var.getIntent()) == null || !intent.getBooleanExtra("isNewUser", false))) {
                    z = false;
                }
                return q1c.f(Boolean.valueOf(z));
            case 9:
                yk8 yk8Var = (yk8) obj;
                if (z2) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new fnc(2), 2);
                }
                yk8Var.y("android.permission.CAMERA", null);
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                gh6 gh6Var = (gh6) obj;
                if (!z2) {
                    gh6Var.c();
                }
                return wefVar;
            default:
                mhf mhfVar = (mhf) obj;
                if (z2) {
                    mhfVar.f(new z3(mhfVar, null));
                }
                return wefVar;
        }
    }

    public /* synthetic */ mv0(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
