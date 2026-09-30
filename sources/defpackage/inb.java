package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class inb extends nnb implements vf7 {
    public final Constructor a;

    public inb(Constructor constructor) {
        this.a = constructor;
    }

    @Override // defpackage.nnb
    public final Member b() {
        return this.a;
    }

    @Override // defpackage.vf7
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new tnb(typeVariable));
        }
        return arrayList;
    }
}
