package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import defpackage.gu0;
import defpackage.hzb;
import defpackage.kw;
import defpackage.oa7;
import defpackage.thg;
import defpackage.tig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class BasePendingResult<R extends hzb> {
    public static final kw j = new kw(13);
    public hzb e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(thg thgVar) {
        new gu0(thgVar != null ? thgVar.a.g : Looper.getMainLooper(), 0);
        new WeakReference(thgVar);
    }

    public final void a(tig tigVar) {
        synchronized (this.a) {
            try {
                if (d()) {
                    tigVar.a(this.f);
                } else {
                    this.c.add(tigVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract hzb b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(hzb hzbVar) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    return;
                }
                d();
                oa7.C("Results have already been set", !d());
                oa7.C("Result has already been consumed", !this.g);
                this.e = hzbVar;
                this.f = hzbVar.a();
                this.b.countDown();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((tig) arrayList.get(i)).a(this.f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
