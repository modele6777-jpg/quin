package io.sentry;

import defpackage.qc0;
import defpackage.r82;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends AbstractCollection implements Queue, Serializable {
    private static final long serialVersionUID = -8423413834657610406L;
    public transient Object[] a;
    public transient int b = 0;
    public transient int c = 0;
    public transient boolean d = false;
    private final int maxElements;

    public j(int i) {
        if (i <= 0) {
            qc0.j("The size must be greater than 0");
            throw null;
        }
        Object[] objArr = new Object[i];
        this.a = objArr;
        this.maxElements = objArr.length;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = new Object[this.maxElements];
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            this.a[i2] = objectInputStream.readObject();
        }
        this.b = 0;
        boolean z = i == this.maxElements;
        this.d = z;
        if (z) {
            this.c = 0;
        } else {
            this.c = i;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        i iVar = new i(this);
        while (iVar.hasNext()) {
            objectOutputStream.writeObject(iVar.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        int i = 0;
        if (obj == null) {
            r82.g("Attempted to add null object to queue");
            return false;
        }
        if (size() == this.maxElements) {
            remove();
        }
        Object[] objArr = this.a;
        int i2 = this.c;
        int i3 = i2 + 1;
        this.c = i3;
        objArr[i2] = obj;
        if (i3 >= this.maxElements) {
            this.c = 0;
        } else {
            i = i3;
        }
        if (i == this.b) {
            this.d = true;
        }
        return true;
    }

    public final int c(int i) {
        int i2 = i - 1;
        return i2 < 0 ? this.maxElements - 1 : i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.d = false;
        this.b = 0;
        this.c = 0;
        Arrays.fill(this.a, (Object) null);
    }

    public final int d(int i) {
        int i2 = i + 1;
        if (i2 >= this.maxElements) {
            return 0;
        }
        return i2;
    }

    @Override // java.util.Queue
    public final Object element() {
        if (!isEmpty()) {
            return peek();
        }
        com.adjust.sdk.sig.r3.n("queue is empty");
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new i(this);
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.a[this.b];
    }

    @Override // java.util.Queue
    public final Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public final Object remove() {
        if (isEmpty()) {
            com.adjust.sdk.sig.r3.n("queue is empty");
            return null;
        }
        Object[] objArr = this.a;
        int i = this.b;
        Object obj = objArr[i];
        if (obj != null) {
            int i2 = i + 1;
            this.b = i2;
            objArr[i] = null;
            if (i2 >= this.maxElements) {
                this.b = 0;
            }
            this.d = false;
        }
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.c;
        int i2 = this.b;
        if (i < i2) {
            return (this.maxElements - i2) + i;
        }
        if (i != i2) {
            return i - i2;
        }
        if (this.d) {
            return this.maxElements;
        }
        return 0;
    }
}
