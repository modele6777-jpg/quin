package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class czg extends meg implements hzg {
    public czg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 5);
    }

    @Override // defpackage.hzg
    public final String A(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        Parcel parcelI = I(parcelJ, 11);
        String string = parcelI.readString();
        parcelI.recycle();
        return string;
    }

    @Override // defpackage.hzg
    public final void B(Bundle bundle, ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, bundle);
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 19);
    }

    @Override // defpackage.hzg
    public final void D(hsg hsgVar, ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, hsgVar);
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 1);
    }

    @Override // defpackage.hzg
    public final void E(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 18);
    }

    @Override // defpackage.hzg
    public final void F(ndh ndhVar, mng mngVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        lsg.b(parcelJ, mngVar);
        K(parcelJ, 30);
    }

    @Override // defpackage.hzg
    public final List b(String str, String str2, String str3, boolean z) {
        Parcel parcelJ = J();
        parcelJ.writeString(null);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        ClassLoader classLoader = lsg.a;
        parcelJ.writeInt(z ? 1 : 0);
        Parcel parcelI = I(parcelJ, 15);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(mch.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.hzg
    public final void h(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 25);
    }

    @Override // defpackage.hzg
    public final void i(ndh ndhVar, sbh sbhVar, vzg vzgVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        lsg.b(parcelJ, sbhVar);
        lsg.c(parcelJ, vzgVar);
        K(parcelJ, 29);
    }

    @Override // defpackage.hzg
    public final List j(String str, String str2, boolean z, ndh ndhVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        ClassLoader classLoader = lsg.a;
        parcelJ.writeInt(z ? 1 : 0);
        lsg.b(parcelJ, ndhVar);
        Parcel parcelI = I(parcelJ, 14);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(mch.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.hzg
    public final void l(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 6);
    }

    @Override // defpackage.hzg
    public final void m(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 26);
    }

    @Override // defpackage.hzg
    public final void n(mch mchVar, ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, mchVar);
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 2);
    }

    @Override // defpackage.hzg
    public final void o(long j, String str, String str2, String str3) {
        Parcel parcelJ = J();
        parcelJ.writeLong(j);
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        K(parcelJ, 10);
    }

    @Override // defpackage.hzg
    public final List p(String str, String str2, String str3) {
        Parcel parcelJ = J();
        parcelJ.writeString(null);
        parcelJ.writeString(str2);
        parcelJ.writeString(str3);
        Parcel parcelI = I(parcelJ, 17);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(wog.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.hzg
    public final wqg q(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        Parcel parcelI = I(parcelJ, 21);
        wqg wqgVar = (wqg) lsg.a(parcelI, wqg.CREATOR);
        parcelI.recycle();
        return wqgVar;
    }

    @Override // defpackage.hzg
    public final byte[] r(String str, hsg hsgVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, hsgVar);
        parcelJ.writeString(str);
        Parcel parcelI = I(parcelJ, 9);
        byte[] bArrCreateByteArray = parcelI.createByteArray();
        parcelI.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.hzg
    public final void t(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 4);
    }

    @Override // defpackage.hzg
    public final List u(String str, String str2, ndh ndhVar) {
        Parcel parcelJ = J();
        parcelJ.writeString(str);
        parcelJ.writeString(str2);
        lsg.b(parcelJ, ndhVar);
        Parcel parcelI = I(parcelJ, 16);
        ArrayList arrayListCreateTypedArrayList = parcelI.createTypedArrayList(wog.CREATOR);
        parcelI.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.hzg
    public final void v(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 27);
    }

    @Override // defpackage.hzg
    public final void w(ndh ndhVar, Bundle bundle, ozg ozgVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        lsg.b(parcelJ, bundle);
        lsg.c(parcelJ, ozgVar);
        K(parcelJ, 31);
    }

    @Override // defpackage.hzg
    public final void y(ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 20);
    }

    @Override // defpackage.hzg
    public final void z(wog wogVar, ndh ndhVar) {
        Parcel parcelJ = J();
        lsg.b(parcelJ, wogVar);
        lsg.b(parcelJ, ndhVar);
        K(parcelJ, 12);
    }
}
