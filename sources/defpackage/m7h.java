package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m7h implements ypb, yn2 {
    public Object a;
    public Object b;

    public m7h(ysd ysdVar, int i) {
        this.b = ysdVar;
        this.a = new AtomicReferenceArray(i);
    }

    public jbh a(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        jbh jbhVar = (jbh) atomicReferenceArray.get(i);
        if (jbhVar != null) {
            return jbhVar;
        }
        wah wahVarL = ((ysd) this.b).l(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, wahVarL)) {
            if (atomicReferenceArray.get(i) != null) {
                jbh jbhVar2 = (jbh) atomicReferenceArray.get(i);
                jbhVar2.getClass();
                return jbhVar2;
            }
        }
        return wahVarL;
    }

    @Override // defpackage.ypb
    public void accept(Object obj, Object obj2) {
        int i;
        a97 a97Var = (a97) this.a;
        zvg zvgVar = (zvg) obj;
        y2b y2bVar = new y2b(a97Var, (gle) obj2);
        Context context = a97Var.a;
        try {
            i = rcg.a(context).b(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        wob wobVar = (wob) this.b;
        wobVar.f = i;
        hxg hxgVar = (hxg) zvgVar.l();
        c70 c70Var = new c70(new ib2(-1, -1, 0, true), true);
        c70Var.c = false;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i2 = htg.a;
        parcelObtain.writeStrongBinder(y2bVar);
        parcelObtain.writeInt(1);
        wobVar.writeToParcel(parcelObtain, 0);
        parcelObtain.writeInt(1);
        c70Var.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            hxgVar.d.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    public jbh b(int i, long j, String str) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        jbh jbhVar = (jbh) atomicReferenceArray.get(i);
        if (jbhVar != null) {
            return jbhVar;
        }
        dbh dbhVar = new dbh(str, (gn2) ((ysd) this.b).b, j);
        while (!atomicReferenceArray.compareAndSet(i, null, dbhVar)) {
            if (atomicReferenceArray.get(i) != null) {
                jbh jbhVar2 = (jbh) atomicReferenceArray.get(i);
                jbhVar2.getClass();
                return jbhVar2;
            }
        }
        return dbhVar;
    }

    public jbh c(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.a;
        jbh jbhVar = (jbh) atomicReferenceArray.get(i);
        if (jbhVar != null) {
            return jbhVar;
        }
        gbh gbhVar = new gbh(str, (gn2) ((ysd) this.b).b, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, gbhVar)) {
            if (atomicReferenceArray.get(i) != null) {
                jbh jbhVar2 = (jbh) atomicReferenceArray.get(i);
                jbhVar2.getClass();
                return jbhVar2;
            }
        }
        return gbhVar;
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        Bundle bundle;
        return (task.m() && (bundle = (Bundle) task.i()) != null && bundle.containsKey("google.messenger")) ? ((w7c) this.a).b((Bundle) this.b).o(g94.d, pzd.b) : task;
    }

    public /* synthetic */ m7h(Object obj, Parcelable parcelable) {
        this.a = obj;
        this.b = parcelable;
    }
}
