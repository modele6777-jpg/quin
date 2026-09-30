package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kcc implements lw7, Serializable {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(kcc.class, Object.class, "_value");
    private volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private final Object f2final;
    private volatile x16 initializer;

    public kcc(x16 x16Var) {
        x16Var.getClass();
        this.initializer = x16Var;
        m8c m8cVar = m8c.v;
        this._value = m8cVar;
        this.f2final = m8cVar;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new b37(getValue());
    }

    @Override // defpackage.lw7
    public final boolean b() {
        return this._value != m8c.v;
    }

    @Override // defpackage.lw7
    public final Object getValue() {
        Object obj = this._value;
        m8c m8cVar = m8c.v;
        if (obj != m8cVar) {
            return obj;
        }
        x16 x16Var = this.initializer;
        if (x16Var != null) {
            Object objInvoke = x16Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, m8cVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != m8cVar) {
                }
            }
            this.initializer = null;
            return objInvoke;
        }
        return this._value;
    }

    public final String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
