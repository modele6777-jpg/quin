package defpackage;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class z61 implements Iterable {
    public static final m98 a = new m98(new byte[0]);

    public static z61 a(Iterator it, int i) {
        if (i == 1) {
            return (z61) it.next();
        }
        int i2 = i >>> 1;
        return a(it, i2).c(a(it, i - i2));
    }

    public static x61 j() {
        return new x61();
    }

    public final z61 c(z61 z61Var) {
        int size = size();
        int size2 = z61Var.size();
        if (((long) size) + ((long) size2) >= 2147483647L) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        int[] iArr = p6c.v;
        p6c p6cVar = this instanceof p6c ? (p6c) this : null;
        if (z61Var.size() == 0) {
            return this;
        }
        if (size() == 0) {
            return z61Var;
        }
        int size3 = z61Var.size() + size();
        if (size3 < 128) {
            int size4 = size();
            int size5 = z61Var.size();
            byte[] bArr = new byte[size4 + size5];
            d(0, bArr, 0, size4);
            z61Var.d(0, bArr, size4, size5);
            return new m98(bArr);
        }
        if (p6cVar != null) {
            z61 z61Var2 = p6cVar.d;
            if (z61Var.size() + z61Var2.size() < 128) {
                int size6 = z61Var2.size();
                int size7 = z61Var.size();
                byte[] bArr2 = new byte[size6 + size7];
                z61Var2.d(0, bArr2, 0, size6);
                z61Var.d(0, bArr2, size6, size7);
                return new p6c(p6cVar.c, new m98(bArr2));
            }
        }
        if (p6cVar != null) {
            z61 z61Var3 = p6cVar.d;
            z61 z61Var4 = p6cVar.c;
            if (z61Var4.f() > z61Var3.f() && p6cVar.f > z61Var.f()) {
                return new p6c(z61Var4, new p6c(z61Var3, z61Var));
            }
        }
        if (size3 >= p6c.v[Math.max(f(), z61Var.f()) + 1]) {
            return new p6c(this, z61Var);
        }
        g5b g5bVar = new g5b(3);
        g5bVar.m(this);
        g5bVar.m(z61Var);
        Stack stack = (Stack) g5bVar.b;
        z61 p6cVar2 = (z61) stack.pop();
        while (!stack.isEmpty()) {
            p6cVar2 = new p6c((z61) stack.pop(), p6cVar2);
        }
        return p6cVar2;
    }

    public final void d(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            qc0.g(30, "Source offset < 0: ", i);
            return;
        }
        if (i2 < 0) {
            qc0.g(30, "Target offset < 0: ", i2);
            return;
        }
        if (i3 < 0) {
            qc0.g(23, "Length < 0: ", i3);
            return;
        }
        int i4 = i + i3;
        if (i4 > size()) {
            qc0.g(34, "Source end offset < 0: ", i4);
            return;
        }
        int i5 = i2 + i3;
        if (i5 > bArr.length) {
            qc0.g(34, "Target end offset < 0: ", i5);
        } else if (i3 > 0) {
            e(i, bArr, i2, i3);
        }
    }

    public abstract void e(int i, byte[] bArr, int i2, int i3);

    public abstract int f();

    public abstract boolean g();

    public abstract boolean i();

    public abstract int k(int i, int i2, int i3);

    public abstract int m(int i, int i2, int i3);

    public abstract int n();

    public final byte[] o() {
        int size = size();
        if (size == 0) {
            return q87.a;
        }
        byte[] bArr = new byte[size];
        e(0, bArr, 0, size);
        return bArr;
    }

    public abstract String p();

    public final String q() {
        try {
            return p();
        } catch (UnsupportedEncodingException e) {
            cva.q("UTF-8 not supported?", e);
            return null;
        }
    }

    public abstract void r(OutputStream outputStream, int i, int i2);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
