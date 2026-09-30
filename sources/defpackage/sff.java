package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sff implements lw7, Serializable {
    private Object _value;
    private x16 initializer;

    public sff(x16 x16Var) {
        x16Var.getClass();
        this.initializer = x16Var;
        this._value = m8c.v;
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
        if (obj != m8c.v) {
            return obj;
        }
        x16 x16Var = this.initializer;
        x16Var.getClass();
        Object objInvoke = x16Var.invoke();
        this._value = objInvoke;
        this.initializer = null;
        return objInvoke;
    }

    public final String toString() {
        return b() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
