package defpackage;

import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eg9 implements Iterator {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public eg9(z61 z61Var) {
        this.a = 1;
        this.b = new Stack();
        while (z61Var instanceof p6c) {
            p6c p6cVar = (p6c) z61Var;
            ((Stack) this.b).push(p6cVar);
            z61Var = p6cVar.c;
        }
        this.c = (m98) z61Var;
    }

    public m98 a() {
        Stack stack = (Stack) this.b;
        m98 m98Var = (m98) this.c;
        m98 m98Var2 = null;
        if (m98Var == null) {
            s8f.c();
            return null;
        }
        while (!stack.isEmpty()) {
            z61 z61Var = ((p6c) stack.pop()).d;
            while (z61Var instanceof p6c) {
                p6c p6cVar = (p6c) z61Var;
                stack.push(p6cVar);
                z61Var = p6cVar.c;
            }
            m98 m98Var3 = (m98) z61Var;
            if (m98Var3.b.length != 0) {
                m98Var2 = m98Var3;
                break;
            }
        }
        this.c = m98Var2;
        return m98Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                sf9 sf9Var = (sf9) this.b;
                return (sf9Var == null || sf9Var == ((sf9) this.c)) ? false : true;
            default:
                return ((m98) this.c) != null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                sf9 sf9Var = (sf9) this.b;
                this.b = sf9Var.e;
                return sf9Var;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("remove");
            default:
                throw new UnsupportedOperationException();
        }
    }

    public eg9(sf9 sf9Var, sf9 sf9Var2) {
        this.a = 0;
        this.b = sf9Var;
        this.c = sf9Var2;
    }
}
