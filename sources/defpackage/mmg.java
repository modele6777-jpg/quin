package defpackage;

import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mmg implements Cloneable {
    public final omg a;
    public omg b;

    public mmg(omg omgVar) {
        this.a = omgVar;
        if (omgVar.e()) {
            qc0.j("Default instance must be immutable.");
            throw null;
        }
        this.b = omgVar.g();
    }

    public static void a(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public static void b(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof dng) {
            List listB = ((dng) iterable).b();
            if (list != null) {
                r3.f();
                return;
            }
            list.size();
            Iterator it = listB.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof xlg) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                xlg.k(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof ung) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof wng) {
                wng wngVar = (wng) list;
                int i = wngVar.c + size;
                int length = wngVar.b.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = xkg.d(length, 3, 2, 1, 10);
                        }
                        wngVar.b = Arrays.copyOf(wngVar.b, length);
                    } else {
                        wngVar.b = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final void c() {
        if (this.b.e()) {
            return;
        }
        omg omgVarG = this.a.g();
        vng.c.a(omgVarG.getClass()).d(omgVarG, this.b);
        this.b = omgVarG;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final mmg clone() {
        mmg mmgVar = (mmg) this.a.q(5);
        boolean zE = this.b.e();
        omg omgVar = this.b;
        if (zE) {
            omgVar.getClass();
            vng.c.a(omgVar.getClass()).c(omgVar);
            omgVar.f();
            omgVar = this.b;
        }
        mmgVar.b = omgVar;
        return mmgVar;
    }

    public final omg e() {
        boolean zE = this.b.e();
        omg omgVar = this.b;
        if (zE) {
            omgVar.getClass();
            vng.c.a(omgVar.getClass()).c(omgVar);
            omgVar.f();
            omgVar = this.b;
        }
        omgVar.getClass();
        if (omg.o(omgVar, true)) {
            return omgVar;
        }
        throw new cog();
    }

    public final void f(omg omgVar) {
        omg omgVar2 = this.a;
        if (omgVar2.equals(omgVar)) {
            return;
        }
        if (!this.b.e()) {
            omg omgVarG = omgVar2.g();
            vng.c.a(omgVarG.getClass()).d(omgVarG, this.b);
            this.b = omgVarG;
        }
        omg omgVar3 = this.b;
        vng.c.a(omgVar3.getClass()).d(omgVar3, omgVar);
    }

    public final void g(byte[] bArr, int i, hmg hmgVar) throws bng {
        if (!this.b.e()) {
            omg omgVarG = this.a.g();
            vng.c.a(omgVarG.getClass()).d(omgVarG, this.b);
            this.b = omgVarG;
        }
        try {
            vng.c.a(this.b.getClass()).h(this.b, bArr, 0, i, new tlg(hmgVar));
        } catch (bng e) {
            throw e;
        } catch (IOException e2) {
            cva.q("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            s8f.q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
