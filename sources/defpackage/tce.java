package defpackage;

import android.content.ClipboardManager;
import android.content.ContentResolver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tce {
    public static final ace a = new ace(new ond(18));
    public static final ace b;

    static {
        new ace(new ond(19));
        b = new ace(new ond(20));
        new ace(new ond(21));
        new ace(new ond(22));
    }

    public static final ClipboardManager a() {
        return (ClipboardManager) b.getValue();
    }

    public static final ContentResolver b() {
        Object value = a.getValue();
        value.getClass();
        return (ContentResolver) value;
    }
}
