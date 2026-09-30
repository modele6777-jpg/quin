package com.canhub.cropper;

import ai.askquin.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.canhub.cropper.CropImageActivity;
import com.canhub.cropper.CropImageView;
import defpackage.af;
import defpackage.bp;
import defpackage.c7g;
import defpackage.cz2;
import defpackage.ga4;
import defpackage.iz2;
import defpackage.jf;
import defpackage.jz2;
import defpackage.k47;
import defpackage.m93;
import defpackage.nz2;
import defpackage.ot1;
import defpackage.pa7;
import defpackage.pi;
import defpackage.qc0;
import defpackage.r82;
import defpackage.rz2;
import defpackage.sz2;
import defpackage.t72;
import defpackage.ti;
import defpackage.v4e;
import defpackage.vd9;
import defpackage.w;
import defpackage.wy0;
import defpackage.wze;
import defpackage.xy0;
import defpackage.y70;
import defpackage.ye;
import defpackage.ynb;
import defpackage.z7f;
import io.sentry.android.core.b1;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class CropImageActivity extends y70 implements rz2, nz2 {
    public static final /* synthetic */ int X0 = 0;
    public Uri Q0;
    public jz2 R0;
    public CropImageView S0;
    public k47 T0;
    public Uri U0;
    public final jf V0;
    public final jf W0;

    public CropImageActivity() {
        final int i = 0;
        this.V0 = p(new ye(this) { // from class: dz2
            public final /* synthetic */ CropImageActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.ye
            public final void j(Object obj) {
                int i2 = i;
                CropImageActivity cropImageActivity = this.b;
                switch (i2) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i3 = CropImageActivity.X0;
                        if (uri != null) {
                            cropImageActivity.Q0 = uri;
                            CropImageView cropImageView = cropImageActivity.S0;
                            if (cropImageView != null) {
                                cropImageView.setImageUriAsync(uri);
                            }
                        } else {
                            cropImageActivity.w();
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i4 = CropImageActivity.X0;
                        if (!zBooleanValue) {
                            cropImageActivity.w();
                        } else {
                            Uri uri2 = cropImageActivity.U0;
                            if (uri2 != null) {
                                cropImageActivity.Q0 = uri2;
                                CropImageView cropImageView2 = cropImageActivity.S0;
                                if (cropImageView2 != null) {
                                    cropImageView2.setImageUriAsync(uri2);
                                }
                            } else {
                                cropImageActivity.w();
                            }
                        }
                        break;
                }
            }
        }, new af(i));
        final int i2 = 1;
        this.W0 = p(new ye(this) { // from class: dz2
            public final /* synthetic */ CropImageActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.ye
            public final void j(Object obj) {
                int i3 = i2;
                CropImageActivity cropImageActivity = this.b;
                switch (i3) {
                    case 0:
                        Uri uri = (Uri) obj;
                        int i4 = CropImageActivity.X0;
                        if (uri != null) {
                            cropImageActivity.Q0 = uri;
                            CropImageView cropImageView = cropImageActivity.S0;
                            if (cropImageView != null) {
                                cropImageView.setImageUriAsync(uri);
                            }
                        } else {
                            cropImageActivity.w();
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i5 = CropImageActivity.X0;
                        if (!zBooleanValue) {
                            cropImageActivity.w();
                        } else {
                            Uri uri2 = cropImageActivity.U0;
                            if (uri2 != null) {
                                cropImageActivity.Q0 = uri2;
                                CropImageView cropImageView2 = cropImageActivity.S0;
                                if (cropImageView2 != null) {
                                    cropImageView2.setImageUriAsync(uri2);
                                }
                            } else {
                                cropImageActivity.w();
                            }
                        }
                        break;
                }
            }
        }, new af(6));
    }

    public static void x(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem menuItemFindItem = menu.findItem(i);
        if (menuItemFindItem == null || (icon = menuItemFindItem.getIcon()) == null) {
            return;
        }
        try {
            icon.mutate();
            ColorFilter porterDuffColorFilter = null;
            if (Build.VERSION.SDK_INT >= 29) {
                Object objD = bp.D(10);
                if (objD != null) {
                    porterDuffColorFilter = bp.e(i2, objD);
                }
            } else {
                PorterDuff.Mode modeK = m93.K(10);
                if (modeK != null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i2, modeK);
                }
            }
            icon.setColorFilter(porterDuffColorFilter);
            menuItemFindItem.setIcon(icon);
        } catch (Exception e) {
            b1.n("AIC", "Failed to update menu item color", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    @Override // defpackage.nx5, defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onCreate(Bundle bundle) throws Exception {
        Uri uri;
        jz2 jz2Var;
        Uri uriM;
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.crop_image_activity, (ViewGroup) null, false);
        if (viewInflate == null) {
            r82.g("rootView");
            return;
        }
        View view = (CropImageView) viewInflate;
        this.T0 = new k47(24, view, view);
        setContentView(view);
        k47 k47Var = this.T0;
        if (k47Var == null) {
            pa7.g0("binding");
            throw null;
        }
        this.S0 = (CropImageView) k47Var.c;
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        if (bundleExtra != null) {
            Parcelable parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
            if (!(parcelable instanceof Uri)) {
                parcelable = null;
            }
            uri = (Uri) parcelable;
        } else {
            uri = null;
        }
        this.Q0 = uri;
        if (bundleExtra != null) {
            Parcelable parcelable2 = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            if (!(parcelable2 instanceof jz2)) {
                parcelable2 = null;
            }
            jz2Var = (jz2) parcelable2;
            if (jz2Var == null) {
                jz2Var = new jz2(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
            }
        } else {
            jz2Var = new jz2(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
        }
        this.R0 = jz2Var;
        if (bundle == null) {
            Uri uri2 = this.Q0;
            if (uri2 == null || uri2.equals(Uri.EMPTY)) {
                jz2 jz2Var2 = this.R0;
                if (jz2Var2 == null) {
                    pa7.g0("cropImageOptions");
                    throw null;
                }
                boolean z = jz2Var2.b;
                if (jz2Var2.w1) {
                    iz2 iz2Var = new iz2(this, new vd9(12, this));
                    jz2 jz2Var3 = this.R0;
                    if (jz2Var3 == null) {
                        pa7.g0("cropImageOptions");
                        throw null;
                    }
                    boolean z2 = jz2Var3.b;
                    String str = jz2Var3.x1;
                    if (str != null) {
                        if (v4e.Q(str)) {
                            str = null;
                        }
                        if (str != null) {
                            iz2Var.c = str;
                        }
                    }
                    List list = jz2Var3.y1;
                    if (list != null) {
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list != null) {
                            iz2Var.d = list;
                        }
                    }
                    if (z2) {
                        File fileCreateTempFile = File.createTempFile("tmp_image_file", ".png", getCacheDir());
                        fileCreateTempFile.createNewFile();
                        fileCreateTempFile.deleteOnExit();
                        uriM = ynb.M(this, fileCreateTempFile);
                    } else {
                        uriM = null;
                    }
                    iz2Var.b(z2, jz2Var3.a, uriM);
                } else {
                    boolean z3 = jz2Var2.a;
                    if (z3 && z) {
                        final w wVar = new w(1, this, CropImageActivity.class, "openSource", "openSource(Lcom/canhub/cropper/CropImageActivity$Source;)V", 0, 23);
                        ti tiVar = new ti(this);
                        pi piVar = tiVar.a;
                        piVar.j = false;
                        piVar.k = new DialogInterface.OnKeyListener() { // from class: ez2
                            @Override // android.content.DialogInterface.OnKeyListener
                            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                                int i2 = CropImageActivity.X0;
                                if (i == 4 && keyEvent.getAction() == 1) {
                                    CropImageActivity cropImageActivity = this.a;
                                    cropImageActivity.w();
                                    cropImageActivity.finish();
                                }
                                return true;
                            }
                        };
                        piVar.d = piVar.a.getText(R.string.pick_image_chooser_title);
                        String[] strArr = {getString(R.string.pick_image_camera), getString(R.string.pick_image_gallery)};
                        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: fz2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) throws Exception {
                                int i2 = CropImageActivity.X0;
                                wVar.d(i == 0 ? gz2.a : gz2.b);
                            }
                        };
                        piVar.l = strArr;
                        piVar.n = onClickListener;
                        tiVar.create().show();
                    } else if (z3) {
                        this.V0.y("image/*", null);
                    } else if (z) {
                        File fileCreateTempFile2 = File.createTempFile("tmp_image_file", ".png", getCacheDir());
                        fileCreateTempFile2.createNewFile();
                        fileCreateTempFile2.deleteOnExit();
                        Uri uriM2 = ynb.M(this, fileCreateTempFile2);
                        this.U0 = uriM2;
                        this.W0.y(uriM2, null);
                    } else {
                        finish();
                    }
                }
            } else {
                CropImageView cropImageView = this.S0;
                if (cropImageView != null) {
                    cropImageView.setImageUriAsync(this.Q0);
                }
            }
        } else {
            String string = bundle.getString("bundle_key_tmp_uri");
            this.U0 = string != null ? Uri.parse(string) : null;
        }
        jz2 jz2Var4 = this.R0;
        if (jz2Var4 == null) {
            pa7.g0("cropImageOptions");
            throw null;
        }
        int i = jz2Var4.C1;
        k47 k47Var2 = this.T0;
        if (k47Var2 == null) {
            pa7.g0("binding");
            throw null;
        }
        ((CropImageView) k47Var2.b).setBackgroundColor(i);
        c7g c7gVarT = t();
        if (c7gVarT != null) {
            jz2 jz2Var5 = this.R0;
            if (jz2Var5 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            CharSequence charSequence = jz2Var5.b1;
            if (charSequence.length() == 0) {
                charSequence = "";
            }
            setTitle(charSequence);
            wze wzeVar = (wze) c7gVarT.e;
            int i2 = wzeVar.b;
            c7gVarT.h = true;
            wzeVar.a((i2 & (-5)) | 4);
            jz2 jz2Var6 = this.R0;
            if (jz2Var6 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            Integer num = jz2Var6.D1;
            if (num != null) {
                c7gVarT.d.setPrimaryBackground(new ColorDrawable(num.intValue()));
            }
            jz2 jz2Var7 = this.R0;
            if (jz2Var7 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            Integer num2 = jz2Var7.E1;
            if (num2 != null) {
                int iIntValue = num2.intValue();
                SpannableString spannableString = new SpannableString(getTitle());
                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                setTitle(spannableString);
            }
            jz2 jz2Var8 = this.R0;
            if (jz2Var8 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            Integer num3 = jz2Var8.F1;
            if (num3 != null) {
                int iIntValue2 = num3.intValue();
                try {
                    Drawable drawable = getDrawable(R.drawable.ic_arrow_back_24);
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(iIntValue2, PorterDuff.Mode.SRC_ATOP));
                    }
                    wze wzeVar2 = (wze) c7gVarT.e;
                    wzeVar2.f = drawable;
                    int i3 = wzeVar2.b & 4;
                    Toolbar toolbar = wzeVar2.a;
                    if (i3 != 0) {
                        if (drawable == null) {
                            drawable = wzeVar2.o;
                        }
                        toolbar.setNavigationIcon(drawable);
                    } else {
                        toolbar.setNavigationIcon((Drawable) null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        z7f.n(b(), null, new ot1(7, this), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Drawable drawable;
        CharSequence title;
        menu.getClass();
        jz2 jz2Var = this.R0;
        if (jz2Var == null) {
            pa7.g0("cropImageOptions");
            throw null;
        }
        if (!jz2Var.v1) {
            getMenuInflater().inflate(R.menu.crop_image_menu, menu);
            jz2 jz2Var2 = this.R0;
            if (jz2Var2 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            if (!jz2Var2.n1) {
                menu.removeItem(R.id.ic_rotate_left_24);
                menu.removeItem(R.id.ic_rotate_right_24);
            } else if (jz2Var2.p1) {
                menu.findItem(R.id.ic_rotate_left_24).setVisible(true);
            }
            jz2 jz2Var3 = this.R0;
            if (jz2Var3 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            if (!jz2Var3.o1) {
                menu.removeItem(R.id.ic_flip_24);
            }
            jz2 jz2Var4 = this.R0;
            if (jz2Var4 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            if (jz2Var4.t1 != null) {
                MenuItem menuItemFindItem = menu.findItem(R.id.crop_image_menu_crop);
                jz2 jz2Var5 = this.R0;
                if (jz2Var5 == null) {
                    pa7.g0("cropImageOptions");
                    throw null;
                }
                menuItemFindItem.setTitle(jz2Var5.t1);
            }
            try {
                jz2 jz2Var6 = this.R0;
                if (jz2Var6 == null) {
                    pa7.g0("cropImageOptions");
                    throw null;
                }
                int i = jz2Var6.u1;
                if (i != 0) {
                    drawable = getDrawable(i);
                    try {
                        menu.findItem(R.id.crop_image_menu_crop).setIcon(drawable);
                    } catch (Exception e) {
                        e = e;
                        b1.n("AIC", "Failed to read menu crop drawable", e);
                    }
                } else {
                    drawable = null;
                }
                jz2 jz2Var7 = this.R0;
                if (jz2Var7 == null) {
                    pa7.g0("cropImageOptions");
                    throw null;
                }
                int i2 = jz2Var7.c1;
                if (i2 != 0) {
                    x(menu, R.id.ic_rotate_left_24, i2);
                    jz2 jz2Var8 = this.R0;
                    if (jz2Var8 == null) {
                        pa7.g0("cropImageOptions");
                        throw null;
                    }
                    x(menu, R.id.ic_rotate_right_24, jz2Var8.c1);
                    jz2 jz2Var9 = this.R0;
                    if (jz2Var9 == null) {
                        pa7.g0("cropImageOptions");
                        throw null;
                    }
                    x(menu, R.id.ic_flip_24, jz2Var9.c1);
                    if (drawable != null) {
                        jz2 jz2Var10 = this.R0;
                        if (jz2Var10 == null) {
                            pa7.g0("cropImageOptions");
                            throw null;
                        }
                        x(menu, R.id.crop_image_menu_crop, jz2Var10.c1);
                    }
                }
                jz2 jz2Var11 = this.R0;
                if (jz2Var11 == null) {
                    pa7.g0("cropImageOptions");
                    throw null;
                }
                Integer num = jz2Var11.d1;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Iterator it = t72.I(Integer.valueOf(R.id.ic_rotate_left_24), Integer.valueOf(R.id.ic_rotate_right_24), Integer.valueOf(R.id.ic_flip_24), Integer.valueOf(R.id.ic_flip_24_horizontally), Integer.valueOf(R.id.ic_flip_24_vertically), Integer.valueOf(R.id.crop_image_menu_crop)).iterator();
                    while (it.hasNext()) {
                        MenuItem menuItemFindItem2 = menu.findItem(((Number) it.next()).intValue());
                        if (menuItemFindItem2 != null && (title = menuItemFindItem2.getTitle()) != null && (!v4e.Q(title))) {
                            try {
                                SpannableString spannableString = new SpannableString(title);
                                spannableString.setSpan(new ForegroundColorSpan(iIntValue), 0, spannableString.length(), 33);
                                menuItemFindItem2.setTitle(spannableString);
                            } catch (Exception e2) {
                                b1.n("AIC", "Failed to update menu item color", e2);
                            }
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                drawable = null;
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.crop_image_menu_crop) {
            u();
            return true;
        }
        if (itemId == R.id.ic_rotate_left_24) {
            jz2 jz2Var = this.R0;
            if (jz2Var == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            int i = -jz2Var.q1;
            CropImageView cropImageView = this.S0;
            if (cropImageView != null) {
                cropImageView.e(i);
                return true;
            }
        } else if (itemId == R.id.ic_rotate_right_24) {
            jz2 jz2Var2 = this.R0;
            if (jz2Var2 == null) {
                pa7.g0("cropImageOptions");
                throw null;
            }
            int i2 = jz2Var2.q1;
            CropImageView cropImageView2 = this.S0;
            if (cropImageView2 != null) {
                cropImageView2.e(i2);
                return true;
            }
        } else if (itemId == R.id.ic_flip_24_horizontally) {
            CropImageView cropImageView3 = this.S0;
            if (cropImageView3 != null) {
                cropImageView3.z = !cropImageView3.z;
                cropImageView3.a(cropImageView3.getWidth(), cropImageView3.getHeight(), true, false);
                return true;
            }
        } else {
            if (itemId != R.id.ic_flip_24_vertically) {
                if (itemId != 16908332) {
                    return super.onOptionsItemSelected(menuItem);
                }
                w();
                return true;
            }
            CropImageView cropImageView4 = this.S0;
            if (cropImageView4 != null) {
                cropImageView4.E0 = !cropImageView4.E0;
                cropImageView4.a(cropImageView4.getWidth(), cropImageView4.getHeight(), true, false);
            }
        }
        return true;
    }

    @Override // defpackage.vb2, defpackage.ub2, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        bundle.putString("bundle_key_tmp_uri", String.valueOf(this.U0));
    }

    @Override // defpackage.y70, defpackage.nx5, android.app.Activity
    public final void onStart() {
        super.onStart();
        CropImageView cropImageView = this.S0;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(this);
        }
        CropImageView cropImageView2 = this.S0;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(this);
        }
    }

    @Override // defpackage.y70, defpackage.nx5, android.app.Activity
    public final void onStop() {
        super.onStop();
        CropImageView cropImageView = this.S0;
        if (cropImageView != null) {
            cropImageView.setOnSetImageUriCompleteListener(null);
        }
        CropImageView cropImageView2 = this.S0;
        if (cropImageView2 != null) {
            cropImageView2.setOnCropImageCompleteListener(null);
        }
    }

    public final void u() {
        Uri uri;
        int i;
        Uri uri2;
        boolean z;
        jz2 jz2Var = this.R0;
        if (jz2Var == null) {
            pa7.g0("cropImageOptions");
            throw null;
        }
        if (jz2Var.k1) {
            v(null, null, 1);
            return;
        }
        CropImageView cropImageView = this.S0;
        if (cropImageView != null) {
            Bitmap.CompressFormat compressFormat = jz2Var.f1;
            int i2 = jz2Var.g1;
            int i3 = jz2Var.h1;
            int i4 = jz2Var.i1;
            sz2 sz2Var = jz2Var.j1;
            Uri uri3 = jz2Var.e1;
            compressFormat.getClass();
            sz2Var.getClass();
            if (cropImageView.T0 == null) {
                qc0.j("mOnCropImageCompleteListener is not set");
                return;
            }
            CropOverlayView cropOverlayView = cropImageView.b;
            Bitmap bitmap = cropImageView.w;
            if (bitmap != null) {
                WeakReference weakReference = cropImageView.d1;
                xy0 xy0Var = weakReference != null ? (xy0) weakReference.get() : null;
                if (xy0Var != null) {
                    xy0Var.I0.h(null);
                }
                Pair pair = (cropImageView.V0 > 1 || sz2Var == sz2.b) ? new Pair(Integer.valueOf(bitmap.getWidth() * cropImageView.V0), Integer.valueOf(bitmap.getHeight() * cropImageView.V0)) : new Pair(0, 0);
                Integer num = (Integer) pair.first;
                Integer num2 = (Integer) pair.second;
                Context context = cropImageView.getContext();
                context.getClass();
                WeakReference weakReference2 = new WeakReference(cropImageView);
                Uri uri4 = cropImageView.U0;
                float[] cropPoints = cropImageView.getCropPoints();
                int i5 = cropImageView.y;
                num.getClass();
                int iIntValue = num.intValue();
                num2.getClass();
                int iIntValue2 = num2.intValue();
                cropOverlayView.getClass();
                boolean z2 = cropOverlayView.S0;
                int i6 = i4;
                int aspectRatioX = cropOverlayView.getAspectRatioX();
                int aspectRatioY = cropOverlayView.getAspectRatioY();
                sz2 sz2Var2 = sz2.a;
                if (sz2Var != sz2Var2) {
                    i = i3;
                    uri = uri4;
                } else {
                    uri = uri4;
                    i = 0;
                }
                if (sz2Var == sz2Var2) {
                    i6 = 0;
                }
                boolean z3 = cropImageView.z;
                boolean z4 = cropImageView.E0;
                if (uri3 == null) {
                    uri2 = cropImageView.e1;
                    z = z4;
                } else {
                    uri2 = uri3;
                    z = z4;
                }
                new WeakReference(new xy0(context, weakReference2, uri, bitmap, cropPoints, i5, iIntValue, iIntValue2, z2, aspectRatioX, aspectRatioY, i, i6, z3, z, sz2Var, compressFormat, i2, uri2));
                cropImageView.d1 = r13;
                Object obj = r13.get();
                obj.getClass();
                xy0 xy0Var2 = (xy0) obj;
                xy0Var2.I0 = ynb.V(xy0Var2, ga4.a, null, new wy0(xy0Var2, null), 2);
                cropImageView.h();
            }
        }
    }

    public final void v(Uri uri, Exception exc, int i) {
        int i2 = exc != null ? 204 : -1;
        CropImageView cropImageView = this.S0;
        Uri imageUri = cropImageView != null ? cropImageView.getImageUri() : null;
        CropImageView cropImageView2 = this.S0;
        float[] cropPoints = cropImageView2 != null ? cropImageView2.getCropPoints() : null;
        CropImageView cropImageView3 = this.S0;
        Rect cropRect = cropImageView3 != null ? cropImageView3.getCropRect() : null;
        CropImageView cropImageView4 = this.S0;
        int rotatedDegrees = cropImageView4 != null ? cropImageView4.getRotatedDegrees() : 0;
        CropImageView cropImageView5 = this.S0;
        Rect wholeImageRect = cropImageView5 != null ? cropImageView5.getWholeImageRect() : null;
        cropPoints.getClass();
        cz2 cz2Var = new cz2(imageUri, uri, exc, cropPoints, cropRect, wholeImageRect, rotatedDegrees, i);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", cz2Var);
        setResult(i2, intent);
        finish();
    }

    public final void w() {
        setResult(0);
        finish();
    }
}
