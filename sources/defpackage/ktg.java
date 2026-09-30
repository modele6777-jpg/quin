package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ktg {
    public final kxa a;
    public kxa b;
    public final psd c;
    public final gsg d;

    public ktg() {
        kxa kxaVar = new kxa();
        vea veaVar = new vea(28);
        kxaVar.a = veaVar;
        kxa kxaVar2 = new kxa((kxa) null, veaVar);
        kxaVar.c = kxaVar2;
        kxaVar.b = kxaVar2.v();
        ysd ysdVar = new ysd(11);
        kxaVar.d = ysdVar;
        kxaVar2.x("require", new ffh(ysdVar));
        ((HashMap) ysdVar.b).put("internal.platform", ixg.b);
        kxaVar2.x("runtime.counter", new vog(Double.valueOf(0.0d)));
        this.a = kxaVar;
        this.b = ((kxa) kxaVar.b).v();
        final int i = 0;
        this.c = new psd(18, (byte) 0);
        gsg gsgVar = new gsg();
        gsgVar.a = new TreeMap();
        gsgVar.b = new TreeMap();
        this.d = gsgVar;
        final int i2 = 1;
        Callable callable = new Callable(this) { // from class: xjg
            public final /* synthetic */ ktg b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i2;
                ktg ktgVar = this.b;
                switch (i3) {
                    case 0:
                        return new l6h(ktgVar.c);
                    default:
                        return new l6h(ktgVar.d);
                }
            }
        };
        HashMap map = (HashMap) ((ysd) kxaVar.d).b;
        map.put("internal.registerCallback", callable);
        map.put("internal.eventLogger", new Callable(this) { // from class: xjg
            public final /* synthetic */ ktg b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i3 = i;
                ktg ktgVar = this.b;
                switch (i3) {
                    case 0:
                        return new l6h(ktgVar.c);
                    default:
                        return new l6h(ktgVar.d);
                }
            }
        });
    }

    public final boolean a(zjg zjgVar) throws awg {
        psd psdVar = this.c;
        try {
            psdVar.b = zjgVar;
            psdVar.c = zjgVar.clone();
            ((ArrayList) psdVar.d).clear();
            ((kxa) this.a.c).x("runtime.counter", new vog(Double.valueOf(0.0d)));
            this.d.b(this.b.v(), psdVar);
            return (((zjg) psdVar.c).equals((zjg) psdVar.b) && ((ArrayList) psdVar.d).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new awg(th);
        }
    }

    public final void b(b5h b5hVar) throws awg {
        qpg qpgVar;
        try {
            kxa kxaVar = this.a;
            this.b = ((kxa) kxaVar.b).v();
            if (kxaVar.m(this.b, (f5h[]) b5hVar.r().toArray(new f5h[0])) instanceof fog) {
                throw new IllegalStateException("Program loading failed");
            }
            for (u4h u4hVar : b5hVar.s().r()) {
                List listS = u4hVar.s();
                String strR = u4hVar.r();
                Iterator it = listS.iterator();
                while (it.hasNext()) {
                    vqg vqgVarM = kxaVar.m(this.b, (f5h) it.next());
                    if (!(vqgVarM instanceof rqg)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    kxa kxaVar2 = this.b;
                    if (kxaVar2.w(strR)) {
                        vqg vqgVarZ = kxaVar2.z(strR);
                        if (!(vqgVarZ instanceof qpg)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strR)));
                        }
                        qpgVar = (qpg) vqgVarZ;
                    } else {
                        qpgVar = null;
                    }
                    if (qpgVar == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strR)));
                    }
                    qpgVar.b(this.b, Collections.singletonList(vqgVarM));
                }
            }
        } catch (Throwable th) {
            throw new awg(th);
        }
    }
}
