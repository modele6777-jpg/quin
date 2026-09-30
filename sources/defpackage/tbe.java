package defpackage;

import android.graphics.Canvas;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tbe implements bv6 {
    public final gg7 a;
    public final vea b;
    public final int c;
    public final int d;

    public tbe(gg7 gg7Var, vea veaVar, int i, int i2) {
        this.a = gg7Var;
        this.b = veaVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.bv6
    public final long a() {
        return 2048L;
    }

    @Override // defpackage.bv6
    public final boolean b() {
        return true;
    }

    @Override // defpackage.bv6
    public final int c() {
        return this.d;
    }

    @Override // defpackage.bv6
    public final int d() {
        return this.c;
    }

    @Override // defpackage.bv6
    public final void e(Canvas canvas) {
        ArrayList arrayList;
        gg7 gg7Var = this.a;
        gg7Var.getClass();
        s71 s71Var = (s71) gg7Var.c;
        vea veaVar = this.b;
        if (veaVar == null) {
            veaVar = new vea(3);
        }
        if (((v79) veaVar.c) == null) {
            veaVar.c = new v79(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        hbc hbcVar = new hbc();
        hbcVar.a = canvas;
        hbcVar.b = gg7Var;
        aac aacVar = (aac) gg7Var.b;
        if (aacVar == null) {
            b1.l("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        v79 v79Var = aacVar.o;
        ita itaVar = aacVar.n;
        s71 s71Var2 = (s71) veaVar.b;
        if (s71Var2 != null) {
            ArrayList arrayList2 = s71Var2.b;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                s71Var.g((s71) veaVar.b);
            }
        }
        hbcVar.c = new ebc();
        hbcVar.d = new Stack();
        hbcVar.Q0((ebc) hbcVar.c, z9c.a());
        ebc ebcVar = (ebc) hbcVar.c;
        ebcVar.f = null;
        ebcVar.h = false;
        ((Stack) hbcVar.d).push(new ebc(ebcVar));
        hbcVar.f = new Stack();
        hbcVar.e = new Stack();
        Boolean bool = aacVar.d;
        if (bool != null) {
            ((ebc) hbcVar.c).h = bool.booleanValue();
        }
        hbcVar.L0();
        v79 v79Var2 = new v79((v79) veaVar.c);
        l9c l9cVar = aacVar.r;
        if (l9cVar != null) {
            v79Var2.d = l9cVar.c(hbcVar, v79Var2.d);
        }
        l9c l9cVar2 = aacVar.s;
        if (l9cVar2 != null) {
            v79Var2.e = l9cVar2.c(hbcVar, v79Var2.e);
        }
        hbcVar.z0(aacVar, v79Var2, v79Var, itaVar);
        hbcVar.K0();
        s71 s71Var3 = (s71) veaVar.b;
        if (s71Var3 != null) {
            ArrayList arrayList3 = s71Var3.b;
            if ((arrayList3 != null ? arrayList3.size() : 0) <= 0 || (arrayList = s71Var.b) == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((r71) it.next()).c == 2) {
                    it.remove();
                }
            }
        }
    }
}
