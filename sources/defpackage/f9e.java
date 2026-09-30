package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface f9e extends Closeable {
    o9e C(String str);

    boolean I0();

    void J();

    boolean S();

    int S0(ContentValues contentValues, Object[] objArr);

    void V();

    void X(String str, Object[] objArr);

    void Z();

    boolean isOpen();

    Cursor l0(String str);

    boolean q();

    void q0();

    void t();

    Cursor w(j9e j9eVar);

    void y();

    void z(String str);
}
