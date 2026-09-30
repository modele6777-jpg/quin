package defpackage;

import android.os.Looper;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s9h {
    public final w6h a;

    public s9h(w6h w6hVar) {
        this.a = w6hVar;
    }

    public static e0 b(Task task) {
        k7h k7hVar = new k7h();
        k7hVar.v = task;
        fnb fnbVar = new fnb(k7hVar);
        f94 f94Var = f94.a;
        task.c(f94Var, fnbVar);
        int i = g0.z;
        e0 e0Var = new e0(k7hVar, x60.class, q9h.a);
        k7hVar.b(e0Var, bzd.G(f94Var, e0Var));
        return e0Var;
    }

    public final e0 a(adh adhVar) throws Throwable {
        String string;
        w6h w6hVar = this.a;
        String simpleName = g7h.class.getSimpleName();
        Looper looper = w6hVar.g;
        oa7.B(looper, "Looper must not be null");
        gn2 gn2Var = new gn2();
        gn2Var.a = new dd7(looper);
        oa7.x(simpleName);
        gn2Var.b = new a98(adhVar, simpleName);
        String strY = s.y();
        if (strY == null) {
            string = "__PH_INTERNAL__NO_PROCESS__";
        } else {
            int length = strY.length() + 1;
            int iIdentityHashCode = System.identityHashCode(g7h.class);
            StringBuilder sb = new StringBuilder(length + String.valueOf(iIdentityHashCode).length());
            sb.append(strY);
            sb.append("|");
            sb.append(iIdentityHashCode);
            string = sb.toString();
        }
        psd psdVar = new psd(w6hVar, string, gn2Var, 27);
        jwg jwgVar = jwg.I0;
        kv kvVar = new kv();
        kvVar.d = gn2Var;
        kvVar.b = psdVar;
        kvVar.c = jwgVar;
        kvVar.e = new za5[]{k99.k};
        kvVar.a = false;
        a98 a98Var = (a98) ((gn2) kvVar.d).b;
        oa7.B(a98Var, "Key must not be null");
        gn2 gn2Var2 = (gn2) kvVar.d;
        za5[] za5VarArr = (za5[]) kvVar.e;
        boolean z = kvVar.a;
        zi0 zi0Var = new zi0();
        zi0Var.d = kvVar;
        zi0Var.b = gn2Var2;
        zi0Var.c = za5VarArr;
        zi0Var.a = z;
        vrb vrbVar = new vrb(kvVar, a98Var);
        oa7.B((a98) gn2Var2.b, "Listener has already been released.");
        ec6 ec6Var = w6hVar.k;
        ec6Var.getClass();
        gle gleVar = new gle();
        ec6Var.c(gleVar, 0, w6hVar);
        yhg yhgVar = new yhg(new hig(new zhg(zi0Var, vrbVar), gleVar), ec6Var.w.get(), w6hVar);
        sig sigVar = ec6Var.X;
        sigVar.sendMessage(sigVar.obtainMessage(8, yhgVar));
        return b(gleVar.a);
    }
}
