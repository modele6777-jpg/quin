package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ieb implements PointerInputEventHandler {
    public final /* synthetic */ phb a;
    public final /* synthetic */ ufb b;
    public final /* synthetic */ eh6 c;
    public final /* synthetic */ e89 d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ e89 f;
    public final /* synthetic */ e89 g;
    public final /* synthetic */ e89 h;
    public final /* synthetic */ e89 i;
    public final /* synthetic */ e89 j;
    public final /* synthetic */ e89 k;

    public ieb(phb phbVar, ufb ufbVar, eh6 eh6Var, e89 e89Var, e89 e89Var2, e89 e89Var3, e89 e89Var4, e89 e89Var5, e89 e89Var6, e89 e89Var7, e89 e89Var8) {
        this.a = phbVar;
        this.b = ufbVar;
        this.c = eh6Var;
        this.d = e89Var;
        this.e = e89Var2;
        this.f = e89Var3;
        this.g = e89Var4;
        this.h = e89Var5;
        this.i = e89Var6;
        this.j = e89Var7;
        this.k = e89Var8;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [feb] */
    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        final phb phbVar = this.a;
        final ufb ufbVar = this.b;
        final eh6 eh6Var = this.c;
        final e89 e89Var = this.d;
        final e89 e89Var2 = this.e;
        final e89 e89Var3 = this.f;
        final e89 e89Var4 = this.g;
        final e89 e89Var5 = this.h;
        final e89 e89Var6 = this.i;
        final e89 e89Var7 = this.j;
        final e89 e89Var8 = this.k;
        return ffe.e(tiaVar, null, new a26() { // from class: feb
            @Override // defpackage.a26
            public final Object d(Object obj) {
                long jN;
                phb phbVar2;
                eue eueVarD;
                hl9 hl9Var = (hl9) obj;
                bv7 bv7Var = (bv7) e89Var.getValue();
                wef wefVar = wef.a;
                if (bv7Var != null && (eueVarD = (phbVar2 = phbVar).d((jN = bv7Var.N(hl9Var.a)))) != null) {
                    long j = eueVarD.a;
                    rhb rhbVar = (rhb) e89Var2.getValue();
                    boolean zBooleanValue = ((Boolean) e89Var3.getValue()).booleanValue();
                    heb hebVar = new heb(phbVar2, j, e89Var4, e89Var5, e89Var6, e89Var7);
                    ufb ufbVar2 = ufbVar;
                    ufbVar2.getClass();
                    vz9 vz9Var = ufbVar2.b;
                    rhbVar.getClass();
                    ufbVar2.a();
                    ufbVar2.c = zBooleanValue;
                    int i = (int) (jN >> 32);
                    int i2 = (int) (jN & 4294967295L);
                    Rect rect = new Rect(ym8.L(Float.intBitsToFloat(i)), ym8.L(Float.intBitsToFloat(i2)), ym8.L(Float.intBitsToFloat(i)) + 1, ym8.L(Float.intBitsToFloat(i2)) + 1);
                    View view = ufbVar2.a;
                    vz9Var.setValue(view.startActionMode(new tfb(rhbVar, ufbVar2, hebVar, rect), 1));
                    if (((ActionMode) vz9Var.getValue()) != null) {
                        ufbVar2.e = rs0.I(view, new geb(ufbVar2, 1));
                    }
                    if (((ActionMode) vz9Var.getValue()) != null) {
                        ((afa) eh6Var).a(0);
                        ((x16) e89Var8.getValue()).invoke();
                    }
                }
                return wefVar;
            }
        }, null, new geb(ufbVar, 0), xn2Var, 5);
    }
}
