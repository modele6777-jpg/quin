package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.TypedValue;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jz2 implements Parcelable {
    public static final Parcelable.Creator<jz2> CREATOR = new vjg(15);
    public final int A1;
    public final String B1;
    public final int C1;
    public final Integer D1;
    public final boolean E0;
    public final Integer E1;
    public final boolean F0;
    public final Integer F1;
    public final int G0;
    public final Integer G1;
    public final float H0;
    public final boolean I0;
    public final int J0;
    public final int K0;
    public final float L0;
    public final int M0;
    public final float N0;
    public final float O0;
    public final float P0;
    public final int Q0;
    public final int R0;
    public final float S0;
    public final int T0;
    public final int U0;
    public final int V0;
    public final int W0;
    public final int X;
    public final int X0;
    public final boolean Y;
    public final int Y0;
    public final boolean Z;
    public final int Z0;
    public final boolean a;
    public final int a1;
    public final boolean b;
    public final CharSequence b1;
    public final lz2 c;
    public final int c1;
    public final kz2 d;
    public final Integer d1;
    public final float e;
    public final Uri e1;
    public final float f;
    public final Bitmap.CompressFormat f1;
    public final float g;
    public final int g1;
    public final int h1;
    public final int i1;
    public final sz2 j1;
    public final boolean k1;
    public final Rect l1;
    public final int m1;
    public final boolean n1;
    public final boolean o1;
    public final boolean p1;
    public final int q1;
    public final boolean r1;
    public final boolean s1;
    public final CharSequence t1;
    public final int u1;
    public final mz2 v;
    public final boolean v1;
    public final tz2 w;
    public final boolean w1;
    public final boolean x;
    public final String x1;
    public final boolean y;
    public final List y1;
    public final boolean z;
    public final float z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jz2(lz2 lz2Var, kz2 kz2Var, float f, float f2, float f3, mz2 mz2Var, tz2 tz2Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, float f4, boolean z7, int i2, int i3, float f5, int i4, float f6, float f7, float f8, int i5, int i6, float f9, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z8, boolean z9, float f10, int i15, String str, int i16, int i17, int i18) {
        boolean z10;
        int iArgb;
        lz2 lz2Var2 = (i16 & 4) != 0 ? lz2.a : lz2Var;
        kz2 kz2Var2 = (i16 & 8) != 0 ? kz2.a : kz2Var;
        float fApplyDimension = (i16 & 16) != 0 ? TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics()) : f;
        float fApplyDimension2 = (i16 & 32) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f2;
        float fApplyDimension3 = (i16 & 64) != 0 ? TypedValue.applyDimension(1, 24.0f, Resources.getSystem().getDisplayMetrics()) : f3;
        mz2 mz2Var2 = (i16 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? mz2.b : mz2Var;
        tz2 tz2Var2 = (i16 & 256) != 0 ? tz2.a : tz2Var;
        boolean z11 = (i16 & 512) != 0 ? true : z;
        boolean z12 = (i16 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? false : z2;
        boolean z13 = (i16 & 2048) != 0 ? true : z3;
        int iRgb = Color.rgb(153, 51, 153);
        boolean z14 = (i16 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? true : z4;
        boolean z15 = (i16 & 16384) != 0 ? false : z5;
        boolean z16 = (32768 & i16) != 0 ? true : z6;
        int i19 = (131072 & i16) != 0 ? 4 : i;
        float f11 = (262144 & i16) != 0 ? 0.0f : f4;
        boolean z17 = (524288 & i16) != 0 ? false : z7;
        int i20 = (1048576 & i16) != 0 ? 1 : i2;
        int i21 = (2097152 & i16) != 0 ? 1 : i3;
        float fApplyDimension4 = (i16 & 4194304) != 0 ? TypedValue.applyDimension(1, 3.0f, Resources.getSystem().getDisplayMetrics()) : f5;
        int iArgb2 = (i16 & 8388608) != 0 ? Color.argb(170, 255, 255, 255) : i4;
        float fApplyDimension5 = (16777216 & i16) != 0 ? TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics()) : f6;
        float fApplyDimension6 = (33554432 & i16) != 0 ? TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics()) : f7;
        float fApplyDimension7 = (67108864 & i16) != 0 ? TypedValue.applyDimension(1, 14.0f, Resources.getSystem().getDisplayMetrics()) : f8;
        int i22 = (134217728 & i16) != 0 ? -1 : i5;
        int i23 = (268435456 & i16) != 0 ? -1 : i6;
        float fApplyDimension8 = (536870912 & i16) != 0 ? TypedValue.applyDimension(1, 1.0f, Resources.getSystem().getDisplayMetrics()) : f9;
        int iArgb3 = (i16 & 1073741824) != 0 ? Color.argb(170, 255, 255, 255) : i7;
        if ((i16 & Integer.MIN_VALUE) != 0) {
            z10 = false;
            iArgb = Color.argb(119, 0, 0, 0);
        } else {
            z10 = false;
            iArgb = i8;
        }
        this(true, true, lz2Var2, kz2Var2, fApplyDimension, fApplyDimension2, fApplyDimension3, mz2Var2, tz2Var2, z11, z12, z13, iRgb, z14, z15, z16, true, i19, f11, z17, i20, i21, fApplyDimension4, iArgb2, fApplyDimension5, fApplyDimension6, fApplyDimension7, i22, i23, fApplyDimension8, iArgb3, iArgb, (i17 & 1) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i9, (i17 & 2) != 0 ? (int) TypedValue.applyDimension(1, 42.0f, Resources.getSystem().getDisplayMetrics()) : i10, (i17 & 4) != 0 ? 40 : i11, (i17 & 8) != 0 ? 40 : i12, (i17 & 16) != 0 ? 99999 : i13, (i17 & 32) != 0 ? 99999 : i14, "", 0, null, null, Bitmap.CompressFormat.JPEG, 90, 0, 0, sz2.a, false, null, -1, true, true, false, 90, (i17 & 4194304) != 0 ? z10 : z8, (i17 & 8388608) != 0 ? z10 : z9, null, 0, false, false, null, pu4.a, (i17 & 1073741824) != 0 ? TypedValue.applyDimension(2, 20.0f, Resources.getSystem().getDisplayMetrics()) : f10, (i17 & Integer.MIN_VALUE) != 0 ? -1 : i15, (i18 & 1) != 0 ? "" : str, -1, null, null, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz2)) {
            return false;
        }
        jz2 jz2Var = (jz2) obj;
        return this.a == jz2Var.a && this.b == jz2Var.b && this.c == jz2Var.c && this.d == jz2Var.d && Float.compare(this.e, jz2Var.e) == 0 && Float.compare(this.f, jz2Var.f) == 0 && Float.compare(this.g, jz2Var.g) == 0 && this.v == jz2Var.v && this.w == jz2Var.w && this.x == jz2Var.x && this.y == jz2Var.y && this.z == jz2Var.z && this.X == jz2Var.X && this.Y == jz2Var.Y && this.Z == jz2Var.Z && this.E0 == jz2Var.E0 && this.F0 == jz2Var.F0 && this.G0 == jz2Var.G0 && Float.compare(this.H0, jz2Var.H0) == 0 && this.I0 == jz2Var.I0 && this.J0 == jz2Var.J0 && this.K0 == jz2Var.K0 && Float.compare(this.L0, jz2Var.L0) == 0 && this.M0 == jz2Var.M0 && Float.compare(this.N0, jz2Var.N0) == 0 && Float.compare(this.O0, jz2Var.O0) == 0 && Float.compare(this.P0, jz2Var.P0) == 0 && this.Q0 == jz2Var.Q0 && this.R0 == jz2Var.R0 && Float.compare(this.S0, jz2Var.S0) == 0 && this.T0 == jz2Var.T0 && this.U0 == jz2Var.U0 && this.V0 == jz2Var.V0 && this.W0 == jz2Var.W0 && this.X0 == jz2Var.X0 && this.Y0 == jz2Var.Y0 && this.Z0 == jz2Var.Z0 && this.a1 == jz2Var.a1 && pa7.t(this.b1, jz2Var.b1) && this.c1 == jz2Var.c1 && pa7.t(this.d1, jz2Var.d1) && pa7.t(this.e1, jz2Var.e1) && this.f1 == jz2Var.f1 && this.g1 == jz2Var.g1 && this.h1 == jz2Var.h1 && this.i1 == jz2Var.i1 && this.j1 == jz2Var.j1 && this.k1 == jz2Var.k1 && pa7.t(this.l1, jz2Var.l1) && this.m1 == jz2Var.m1 && this.n1 == jz2Var.n1 && this.o1 == jz2Var.o1 && this.p1 == jz2Var.p1 && this.q1 == jz2Var.q1 && this.r1 == jz2Var.r1 && this.s1 == jz2Var.s1 && pa7.t(this.t1, jz2Var.t1) && this.u1 == jz2Var.u1 && this.v1 == jz2Var.v1 && this.w1 == jz2Var.w1 && pa7.t(this.x1, jz2Var.x1) && pa7.t(this.y1, jz2Var.y1) && Float.compare(this.z1, jz2Var.z1) == 0 && this.A1 == jz2Var.A1 && pa7.t(this.B1, jz2Var.B1) && this.C1 == jz2Var.C1 && pa7.t(this.D1, jz2Var.D1) && pa7.t(this.E1, jz2Var.E1) && pa7.t(this.F1, jz2Var.F1) && pa7.t(this.G1, jz2Var.G1);
    }

    public final int hashCode() {
        int iB = ub3.b(this.c1, (this.b1.hashCode() + ub3.b(this.a1, ub3.b(this.Z0, ub3.b(this.Y0, ub3.b(this.X0, ub3.b(this.W0, ub3.b(this.V0, ub3.b(this.U0, ub3.b(this.T0, ub3.a(this.S0, ub3.b(this.R0, ub3.b(this.Q0, ub3.a(this.P0, ub3.a(this.O0, ub3.a(this.N0, ub3.b(this.M0, ub3.a(this.L0, ub3.b(this.K0, ub3.b(this.J0, ub3.d(ub3.a(this.H0, ub3.b(this.G0, ub3.d(ub3.d(ub3.d(ub3.d(ub3.b(this.X, ub3.d(ub3.d(ub3.d((this.w.hashCode() + ((this.v.hashCode() + ub3.a(this.g, ub3.a(this.f, ub3.a(this.e, (this.d.hashCode() + ((this.c.hashCode() + ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31), 31), 31)) * 31)) * 31, 31, this.x), 31, this.y), 31, this.z), 31), 31, this.Y), 31, this.Z), 31, this.E0), 31, this.F0), 31), 31), 31, this.I0), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
        Integer num = this.d1;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.e1;
        int iD = ub3.d((this.j1.hashCode() + ub3.b(this.i1, ub3.b(this.h1, ub3.b(this.g1, (this.f1.hashCode() + ((iHashCode + (uri == null ? 0 : uri.hashCode())) * 31)) * 31, 31), 31), 31)) * 31, 31, this.k1);
        Rect rect = this.l1;
        int iD2 = ub3.d(ub3.d(ub3.b(this.q1, ub3.d(ub3.d(ub3.d(ub3.b(this.m1, (iD + (rect == null ? 0 : rect.hashCode())) * 31, 31), 31, this.n1), 31, this.o1), 31, this.p1), 31), 31, this.r1), 31, this.s1);
        CharSequence charSequence = this.t1;
        int iD3 = ub3.d(ub3.d(ub3.b(this.u1, (iD2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31), 31, this.v1), 31, this.w1);
        String str = this.x1;
        int iHashCode2 = (iD3 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.y1;
        int iB2 = ub3.b(this.A1, ub3.a(this.z1, (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31), 31);
        String str2 = this.B1;
        int iB3 = ub3.b(this.C1, (iB2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num2 = this.D1;
        int iHashCode3 = (iB3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.E1;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.F1;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.G1;
        return iHashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("CropImageOptions(imageSourceIncludeGallery=", ", imageSourceIncludeCamera=", ", cropShape=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", cornerShape=");
        sbP.append(this.d);
        sbP.append(", cropCornerRadius=");
        ks0.w(sbP, this.e, ", snapRadius=", this.f, ", touchRadius=");
        sbP.append(this.g);
        sbP.append(", guidelines=");
        sbP.append(this.v);
        sbP.append(", scaleType=");
        sbP.append(this.w);
        sbP.append(", showCropOverlay=");
        sbP.append(this.x);
        sbP.append(", showCropLabel=");
        ib8.w(sbP, this.y, ", showProgressBar=", this.z, ", progressBarColor=");
        sbP.append(this.X);
        sbP.append(", autoZoomEnabled=");
        sbP.append(this.Y);
        sbP.append(", multiTouchEnabled=");
        ib8.w(sbP, this.Z, ", centerMoveEnabled=", this.E0, ", canChangeCropWindow=");
        sbP.append(this.F0);
        sbP.append(", maxZoom=");
        sbP.append(this.G0);
        sbP.append(", initialCropWindowPaddingRatio=");
        sbP.append(this.H0);
        sbP.append(", fixAspectRatio=");
        sbP.append(this.I0);
        sbP.append(", aspectRatioX=");
        ub3.u(sbP, this.J0, ", aspectRatioY=", this.K0, ", borderLineThickness=");
        sbP.append(this.L0);
        sbP.append(", borderLineColor=");
        sbP.append(this.M0);
        sbP.append(", borderCornerThickness=");
        ks0.w(sbP, this.N0, ", borderCornerOffset=", this.O0, ", borderCornerLength=");
        sbP.append(this.P0);
        sbP.append(", borderCornerColor=");
        sbP.append(this.Q0);
        sbP.append(", circleCornerFillColorHexValue=");
        sbP.append(this.R0);
        sbP.append(", guidelinesThickness=");
        sbP.append(this.S0);
        sbP.append(", guidelinesColor=");
        ub3.u(sbP, this.T0, ", backgroundColor=", this.U0, ", minCropWindowWidth=");
        ub3.u(sbP, this.V0, ", minCropWindowHeight=", this.W0, ", minCropResultWidth=");
        ub3.u(sbP, this.X0, ", minCropResultHeight=", this.Y0, ", maxCropResultWidth=");
        ub3.u(sbP, this.Z0, ", maxCropResultHeight=", this.a1, ", activityTitle=");
        sbP.append((Object) this.b1);
        sbP.append(", activityMenuIconColor=");
        sbP.append(this.c1);
        sbP.append(", activityMenuTextColor=");
        sbP.append(this.d1);
        sbP.append(", customOutputUri=");
        sbP.append(this.e1);
        sbP.append(", outputCompressFormat=");
        sbP.append(this.f1);
        sbP.append(", outputCompressQuality=");
        sbP.append(this.g1);
        sbP.append(", outputRequestWidth=");
        ub3.u(sbP, this.h1, ", outputRequestHeight=", this.i1, ", outputRequestSizeOptions=");
        sbP.append(this.j1);
        sbP.append(", noOutputImage=");
        sbP.append(this.k1);
        sbP.append(", initialCropWindowRectangle=");
        sbP.append(this.l1);
        sbP.append(", initialRotation=");
        sbP.append(this.m1);
        sbP.append(", allowRotation=");
        ib8.w(sbP, this.n1, ", allowFlipping=", this.o1, ", allowCounterRotation=");
        sbP.append(this.p1);
        sbP.append(", rotationDegrees=");
        sbP.append(this.q1);
        sbP.append(", flipHorizontally=");
        ib8.w(sbP, this.r1, ", flipVertically=", this.s1, ", cropMenuCropButtonTitle=");
        sbP.append((Object) this.t1);
        sbP.append(", cropMenuCropButtonIcon=");
        sbP.append(this.u1);
        sbP.append(", skipEditing=");
        ib8.w(sbP, this.v1, ", showIntentChooser=", this.w1, ", intentChooserTitle=");
        ib8.v(sbP, this.x1, ", intentChooserPriorityList=", this.y1, ", cropperLabelTextSize=");
        sbP.append(this.z1);
        sbP.append(", cropperLabelTextColor=");
        sbP.append(this.A1);
        sbP.append(", cropperLabelText=");
        sbP.append(this.B1);
        sbP.append(", activityBackgroundColor=");
        sbP.append(this.C1);
        sbP.append(", toolbarColor=");
        sbP.append(this.D1);
        sbP.append(", toolbarTitleColor=");
        sbP.append(this.E1);
        sbP.append(", toolbarBackButtonColor=");
        sbP.append(this.F1);
        sbP.append(", toolbarTintColor=");
        sbP.append(this.G1);
        sbP.append(")");
        return sbP.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeString(this.c.name());
        parcel.writeString(this.d.name());
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeString(this.v.name());
        parcel.writeString(this.w.name());
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeInt(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeInt(this.Z ? 1 : 0);
        parcel.writeInt(this.E0 ? 1 : 0);
        parcel.writeInt(this.F0 ? 1 : 0);
        parcel.writeInt(this.G0);
        parcel.writeFloat(this.H0);
        parcel.writeInt(this.I0 ? 1 : 0);
        parcel.writeInt(this.J0);
        parcel.writeInt(this.K0);
        parcel.writeFloat(this.L0);
        parcel.writeInt(this.M0);
        parcel.writeFloat(this.N0);
        parcel.writeFloat(this.O0);
        parcel.writeFloat(this.P0);
        parcel.writeInt(this.Q0);
        parcel.writeInt(this.R0);
        parcel.writeFloat(this.S0);
        parcel.writeInt(this.T0);
        parcel.writeInt(this.U0);
        parcel.writeInt(this.V0);
        parcel.writeInt(this.W0);
        parcel.writeInt(this.X0);
        parcel.writeInt(this.Y0);
        parcel.writeInt(this.Z0);
        parcel.writeInt(this.a1);
        TextUtils.writeToParcel(this.b1, parcel, i);
        parcel.writeInt(this.c1);
        Integer num = this.d1;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeParcelable(this.e1, i);
        parcel.writeString(this.f1.name());
        parcel.writeInt(this.g1);
        parcel.writeInt(this.h1);
        parcel.writeInt(this.i1);
        parcel.writeString(this.j1.name());
        parcel.writeInt(this.k1 ? 1 : 0);
        parcel.writeParcelable(this.l1, i);
        parcel.writeInt(this.m1);
        parcel.writeInt(this.n1 ? 1 : 0);
        parcel.writeInt(this.o1 ? 1 : 0);
        parcel.writeInt(this.p1 ? 1 : 0);
        parcel.writeInt(this.q1);
        parcel.writeInt(this.r1 ? 1 : 0);
        parcel.writeInt(this.s1 ? 1 : 0);
        TextUtils.writeToParcel(this.t1, parcel, i);
        parcel.writeInt(this.u1);
        parcel.writeInt(this.v1 ? 1 : 0);
        parcel.writeInt(this.w1 ? 1 : 0);
        parcel.writeString(this.x1);
        parcel.writeStringList(this.y1);
        parcel.writeFloat(this.z1);
        parcel.writeInt(this.A1);
        parcel.writeString(this.B1);
        parcel.writeInt(this.C1);
        Integer num2 = this.D1;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.E1;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.F1;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.G1;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
    }

    public jz2(boolean z, boolean z2, lz2 lz2Var, kz2 kz2Var, float f, float f2, float f3, mz2 mz2Var, tz2 tz2Var, boolean z3, boolean z4, boolean z5, int i, boolean z6, boolean z7, boolean z8, boolean z9, int i2, float f4, boolean z10, int i3, int i4, float f5, int i5, float f6, float f7, float f8, int i6, int i7, float f9, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, Integer num, Uri uri, Bitmap.CompressFormat compressFormat, int i17, int i18, int i19, sz2 sz2Var, boolean z11, Rect rect, int i20, boolean z12, boolean z13, boolean z14, int i21, boolean z15, boolean z16, CharSequence charSequence2, int i22, boolean z17, boolean z18, String str, List list, float f10, int i23, String str2, int i24, Integer num2, Integer num3, Integer num4, Integer num5) {
        lz2Var.getClass();
        kz2Var.getClass();
        mz2Var.getClass();
        tz2Var.getClass();
        charSequence.getClass();
        compressFormat.getClass();
        sz2Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = lz2Var;
        this.d = kz2Var;
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.v = mz2Var;
        this.w = tz2Var;
        this.x = z3;
        this.y = z4;
        this.z = z5;
        this.X = i;
        this.Y = z6;
        this.Z = z7;
        this.E0 = z8;
        this.F0 = z9;
        this.G0 = i2;
        this.H0 = f4;
        this.I0 = z10;
        this.J0 = i3;
        this.K0 = i4;
        this.L0 = f5;
        this.M0 = i5;
        this.N0 = f6;
        this.O0 = f7;
        this.P0 = f8;
        this.Q0 = i6;
        this.R0 = i7;
        this.S0 = f9;
        this.T0 = i8;
        this.U0 = i9;
        this.V0 = i10;
        this.W0 = i11;
        this.X0 = i12;
        this.Y0 = i13;
        this.Z0 = i14;
        this.a1 = i15;
        this.b1 = charSequence;
        this.c1 = i16;
        this.d1 = num;
        this.e1 = uri;
        this.f1 = compressFormat;
        this.g1 = i17;
        this.h1 = i18;
        this.i1 = i19;
        this.j1 = sz2Var;
        this.k1 = z11;
        this.l1 = rect;
        this.m1 = i20;
        this.n1 = z12;
        this.o1 = z13;
        this.p1 = z14;
        this.q1 = i21;
        this.r1 = z15;
        this.s1 = z16;
        this.t1 = charSequence2;
        this.u1 = i22;
        this.v1 = z17;
        this.w1 = z18;
        this.x1 = str;
        this.y1 = list;
        this.z1 = f10;
        this.A1 = i23;
        this.B1 = str2;
        this.C1 = i24;
        this.D1 = num2;
        this.E1 = num3;
        this.F1 = num4;
        this.G1 = num5;
        if (i2 < 0) {
            qc0.j("Cannot set max zoom to a number < 1");
            throw null;
        }
        if (f3 < 0.0f) {
            qc0.j("Cannot set touch radius value to a number <= 0 ");
            throw null;
        }
        if (f4 < 0.0f || f4 >= 0.5d) {
            qc0.j("Cannot set initial crop window padding value to a number < 0 or >= 0.5");
            throw null;
        }
        if (i3 <= 0) {
            qc0.j("Cannot set aspect ratio value to a number less than or equal to 0.");
            throw null;
        }
        if (i4 <= 0) {
            qc0.j("Cannot set aspect ratio value to a number less than or equal to 0.");
            throw null;
        }
        if (f5 < 0.0f) {
            qc0.j("Cannot set line thickness value to a number less than 0.");
            throw null;
        }
        if (f6 < 0.0f) {
            qc0.j("Cannot set corner thickness value to a number less than 0.");
            throw null;
        }
        if (f9 < 0.0f) {
            qc0.j("Cannot set guidelines thickness value to a number less than 0.");
            throw null;
        }
        if (i11 < 0) {
            qc0.j("Cannot set min crop window height value to a number < 0 ");
            throw null;
        }
        if (i12 < 0) {
            qc0.j("Cannot set min crop result width value to a number < 0 ");
            throw null;
        }
        if (i13 < 0) {
            qc0.j("Cannot set min crop result height value to a number < 0 ");
            throw null;
        }
        if (i14 < i12) {
            qc0.j("Cannot set max crop result width to smaller value than min crop result width");
            throw null;
        }
        if (i15 < i13) {
            qc0.j("Cannot set max crop result height to smaller value than min crop result height");
            throw null;
        }
        if (i18 < 0) {
            qc0.j("Cannot set request width value to a number < 0 ");
            throw null;
        }
        if (i19 < 0) {
            qc0.j("Cannot set request height value to a number < 0 ");
            throw null;
        }
        if (i21 < 0 || i21 > 360) {
            qc0.j("Cannot set rotation degrees value to a number < 0 or > 360");
            throw null;
        }
    }
}
