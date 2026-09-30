package defpackage;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wmb extends umb {
    public final Object[] b;

    public wmb(t99 t99Var, Object[] objArr) {
        super(t99Var);
        this.b = objArr;
    }

    public final ArrayList a() {
        Object gnbVar;
        Object[] objArr = this.b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            obj.getClass();
            Class<?> cls = obj.getClass();
            List list = smb.a;
            if (Enum.class.isAssignableFrom(cls)) {
                gnbVar = new knb(null, (Enum) obj);
            } else if (obj instanceof Annotation) {
                gnbVar = new vmb(null, (Annotation) obj);
            } else if (obj instanceof Object[]) {
                gnbVar = new wmb(null, (Object[]) obj);
            } else {
                gnbVar = obj instanceof Class ? new gnb(null, (Class) obj) : new mnb(null, obj);
            }
            arrayList.add(gnbVar);
        }
        return arrayList;
    }
}
