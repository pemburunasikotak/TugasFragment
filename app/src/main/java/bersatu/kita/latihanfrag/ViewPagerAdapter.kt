package bersatu.kita.latihanfrag

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
class ViewPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    //untuk menenatukan Lokasi dari Fragment
    override fun getItem(position: Int): Fragment {
        return if (position == 0) {
            FirstFrament.newInstance()
        } else {
            SecondFragment()
        }
    }
    //perintah untuk set Titile yang ada di Fragmanet
    override fun getPageTitle(position: Int): CharSequence? {
        return mContext.resources.getString(TAB_TITLES[position])
    }
    //untuk menghitung Fragment yang ada
    override fun getCount(): Int {
        return 2
    }

    //OBbjek yang Berisi Titile
    companion object {
        @StringRes
        //untuk merubah Title dapat kedalam Value String
        private val TAB_TITLES = intArrayOf(R.string.tab_text_1, R.string.tab_text_2)
    }
}
