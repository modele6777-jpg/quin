package defpackage;

import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fga {
    public static final pr4 a = new pr4(1, new bca(11));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(cga cgaVar, l26 l26Var, zn2 zn2Var) {
        dga dgaVar;
        if (zn2Var instanceof dga) {
            dgaVar = (dga) zn2Var;
            int i = dgaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dgaVar.label = i - Integer.MIN_VALUE;
            } else {
                dgaVar = new dga(zn2Var);
            }
        } else {
            dgaVar = new dga(zn2Var);
        }
        Object obj = dgaVar.result;
        int i2 = dgaVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                jzb.q(obj);
                oo3.f();
                return;
            }
        }
        jzb.q(obj);
        if (!((i09) cgaVar).a.Y) {
            qc0.j("establishTextInputSession called from an unattached node");
            return;
        }
        Owner ownerT0 = vd0.t0(cgaVar);
        u8a u8aVar = (u8a) vd0.s0(cgaVar).R0;
        u8aVar.getClass();
        if (od4.B(u8aVar, a) != null) {
            r3.f();
        } else {
            dgaVar.label = 1;
            b(ownerT0, l26Var, dgaVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(Owner owner, l26 l26Var, zn2 zn2Var) {
        ega egaVar;
        if (zn2Var instanceof ega) {
            egaVar = (ega) zn2Var;
            int i = egaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                egaVar.label = i - Integer.MIN_VALUE;
            } else {
                egaVar = new ega(zn2Var);
            }
        } else {
            egaVar = new ega(zn2Var);
        }
        Object obj = egaVar.result;
        int i2 = egaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            egaVar.label = 1;
            ((AndroidComposeView) owner).J(l26Var, egaVar);
        } else if (i2 == 1) {
            jzb.q(obj);
            oo3.f();
        } else if (i2 != 2) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
        } else {
            jzb.q(obj);
            oo3.f();
        }
    }
}
