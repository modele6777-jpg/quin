package io.sentry.android.replay.capture;

import defpackage.wn7;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final /* synthetic */ int a;
    public final AtomicReference b;
    public final /* synthetic */ i c;
    public final /* synthetic */ i d;

    public b(i iVar, i iVar2, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.c = iVar;
                this.d = iVar2;
                this.b = new AtomicReference(null);
                break;
            case 3:
                Boolean bool = Boolean.FALSE;
                this.c = iVar;
                this.d = iVar2;
                this.b = new AtomicReference(bool);
                break;
            case 4:
                this.c = iVar;
                this.d = iVar2;
                this.b = new AtomicReference(null);
                break;
            case 5:
                this.c = iVar;
                this.d = iVar2;
                this.b = new AtomicReference(null);
                break;
            case 6:
                this.c = iVar;
                this.d = iVar2;
                this.b = new AtomicReference(null);
                break;
            default:
                this.c = iVar;
                this.d = iVar2;
                this.b = new AtomicReference(-1);
                break;
        }
    }

    public Object a(wn7 wn7Var, Object obj) {
        int i = this.a;
        AtomicReference atomicReference = this.b;
        wn7Var.getClass();
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return atomicReference.get();
    }

    public b(Object obj, i iVar, i iVar2) {
        this.a = 0;
        this.c = iVar;
        this.d = iVar2;
        this.b = new AtomicReference(obj);
    }
}
