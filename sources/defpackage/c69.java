package defpackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c69 extends q2 {
    private static final long serialVersionUID = 0;
    public transient u8e f;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.f = (u8e) object;
        Object object2 = objectInputStream.readObject();
        Objects.requireNonNull(object2);
        Map map = (Map) object2;
        this.d = map;
        this.e = 0;
        for (Collection collection : map.values()) {
            pa7.A(!collection.isEmpty());
            this.e = collection.size() + this.e;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f);
        objectOutputStream.writeObject(this.d);
    }

    @Override // defpackage.l3
    public final Map b() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new x2(this, (NavigableMap) this.d);
        }
        return map instanceof SortedMap ? new a3(this, (SortedMap) this.d) : new v2(this, this.d);
    }

    @Override // defpackage.l3
    public final Set c() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new y2(this, (NavigableMap) this.d);
        }
        return map instanceof SortedMap ? new b3(this, (SortedMap) this.d) : new w2(this, this.d);
    }
}
