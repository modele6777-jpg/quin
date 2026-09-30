package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kd7 implements Iterator {
    public static final kd7 a;
    public static final /* synthetic */ kd7[] b;

    static {
        kd7 kd7Var = new kd7("INSTANCE", 0);
        a = kd7Var;
        b = new kd7[]{kd7Var};
    }

    public static kd7 valueOf(String str) {
        return (kd7) Enum.valueOf(kd7.class, str);
    }

    public static kd7[] values() {
        return (kd7[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        pa7.I("no calls to next() since the last call to remove()", false);
    }
}
