package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xl3 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xl3(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(tia tiaVar, xn2 xn2Var) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        wef wefVar = wef.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                if (!z) {
                    return wefVar;
                }
                jmb jmbVar = new jmb();
                jmb jmbVar2 = new jmb();
                ctf ctfVar = new ctf();
                n69 n69Var = (n69) obj2;
                kf kfVar = new kf((yl3) obj3, ctfVar, jmbVar, jmbVar2, n69Var, 9);
                a26 a26Var = (a26) obj;
                ad1 ad1Var = new ad1(28, a26Var, ctfVar);
                zh1 zh1Var = new zh1(a26Var, 8);
                q8 q8Var = new q8(ctfVar, jmbVar2, jmbVar, n69Var, 12);
                float f = rk4.a;
                Object objS = k99.s(tiaVar, new lk4(null, ad1Var, zh1Var, kfVar, q8Var), xn2Var);
                return objS == bw2.a ? objS : wefVar;
            default:
                return !z ? wefVar : ffe.e(tiaVar, null, null, null, new w6((e89) obj3, (List) obj2, (e89) obj, 29), xn2Var, 7);
        }
    }
}
