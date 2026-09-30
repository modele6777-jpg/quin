package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k56 implements Cloneable {
    public final t56 a;
    public t56 b;

    public k56(t56 t56Var) {
        this.a = t56Var;
        if (t56Var.l()) {
            qc0.j("Default instance must be immutable.");
            throw null;
        }
        this.b = (t56) t56Var.i(4);
    }

    public static void g(Iterable iterable, List list) {
        Charset charset = p87.a;
        iterable.getClass();
        if (iterable instanceof v18) {
            List listH = ((v18) iterable).h();
            v18 v18Var = (v18) list;
            int size = list.size();
            for (Object obj : listH) {
                if (obj == null) {
                    String str = "Element at index " + (v18Var.size() - size) + " is null.";
                    for (int size2 = v18Var.size() - 1; size2 >= size; size2--) {
                        v18Var.remove(size2);
                    }
                    r82.g(str);
                    return;
                }
                if (obj instanceof y61) {
                    v18Var.W((y61) obj);
                } else {
                    v18Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof l67) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size3 = list.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (list.size() - size3) + " is null.";
                for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                    list.remove(size4);
                }
                r82.g(str2);
                return;
            }
            list.add(obj2);
        }
    }

    public final Object clone() {
        k56 k56Var = (k56) this.a.i(5);
        boolean zL = this.b.l();
        t56 t56Var = this.b;
        if (zL) {
            t56Var.getClass();
            u0b u0bVar = u0b.c;
            u0bVar.getClass();
            u0bVar.a(t56Var.getClass()).b(t56Var);
            t56Var.m();
            t56Var = this.b;
        }
        k56Var.b = t56Var;
        return k56Var;
    }

    public final t56 h() {
        boolean zL = this.b.l();
        t56 t56Var = this.b;
        if (zL) {
            t56Var.getClass();
            u0b u0bVar = u0b.c;
            u0bVar.getClass();
            u0bVar.a(t56Var.getClass()).b(t56Var);
            t56Var.m();
            t56Var = this.b;
        }
        t56Var.getClass();
        boolean zC = true;
        byte bByteValue = ((Byte) t56Var.i(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zC = false;
            } else {
                u0b u0bVar2 = u0b.c;
                u0bVar2.getClass();
                zC = u0bVar2.a(t56Var.getClass()).c(t56Var);
                t56Var.i(2);
            }
        }
        if (zC) {
            return t56Var;
        }
        throw new pef();
    }

    public final void i() {
        if (this.b.l()) {
            return;
        }
        t56 t56Var = (t56) this.a.i(4);
        t56 t56Var2 = this.b;
        u0b u0bVar = u0b.c;
        u0bVar.getClass();
        u0bVar.a(t56Var.getClass()).a(t56Var, t56Var2);
        this.b = t56Var;
    }
}
