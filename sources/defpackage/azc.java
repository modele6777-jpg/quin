package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class azc implements Externalizable {
    private static final long serialVersionUID = 0;
    private Collection<?> collection;
    private final int tag;

    public azc(AbstractCollection abstractCollection, int i) {
        this.collection = abstractCollection;
        this.tag = i;
    }

    private final Object readResolve() {
        return this.collection;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection<?> collectionN;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException(tec.k("Unsupported flags value: ", b, '.'));
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException(tec.k("Illegal size value: ", i2, '.'));
        }
        int i3 = 0;
        if (i == 0) {
            c78 c78Var = new c78(i2);
            while (i3 < i2) {
                c78Var.add(objectInput.readObject());
                i3++;
            }
            collectionN = c78Var.n();
        } else {
            if (i != 1) {
                throw new InvalidObjectException(tec.k("Unsupported collection type tag: ", i, '.'));
            }
            o1d o1dVar = new o1d(i2);
            while (i3 < i2) {
                o1dVar.add(objectInput.readObject());
                i3++;
            }
            collectionN = o1dVar.d();
        }
        this.collection = collectionN;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.tag);
        objectOutput.writeInt(this.collection.size());
        Iterator<?> it = this.collection.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }
}
