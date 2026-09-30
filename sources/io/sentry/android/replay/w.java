package io.sentry.android.replay;

import android.view.View;
import defpackage.cgg;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends CopyOnWriteArrayList {
    final /* synthetic */ x this$0;

    public w(x xVar) {
        this.this$0 = xVar;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        f fVar = (f) obj;
        io.sentry.util.a aVar = this.this$0.b;
        aVar.b();
        try {
            for (View view : this.this$0.d) {
                if (fVar != null) {
                    fVar.b(view, true);
                }
            }
            cgg.t(aVar, null);
            return super.add(fVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.contains((f) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.indexOf((f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.lastIndexOf((f) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof f) {
            return super.remove((f) obj);
        }
        return false;
    }
}
