package com.hss01248.imageloaderdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.piasy.biv.view.BigImageView;
import com.hss01248.image.ImageLoader;

/**
 * Created by Administrator on 2017/3/24 0024.
 */

public class BigImageActy extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_bigpic);

        BigImageView imageView = (BigImageView) findViewById(R.id.mBigImage);
        String url5 ="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490944508&di=671845045c66356487c1a539c4ed0717&imgtype=jpg&er=1&src=http%3A%2F%2Fattach.bbs.letv.com%2Fforum%2F201606%2F27%2F185306g84m4gsxztvzxjt5.jpg";
        String url4 = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490349606605&di=5510cf624bce949b977ba005f1dbaf84&imgtype=0&src=http%3A%2F%2Fattach.bbs.letv.com%2Fforum%2F201607%2F02%2F195153fz3mxtd50d0qjtz9.jpg";
        String url3 = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490349100640&di=11ab9c07a50697318f4f7bf027937500&imgtype=0&src=http%3A%2F%2Fattachments.gfan.com%2Fforum%2F201606%2F24%2F225051v3k31ujn8bcaza8a.jpg";
        String url2 = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490942493&di=6f561dcd4991cdee87d3ef63820627dd&imgtype=jpg&er=1&src=http%3A%2F%2Fimg.coocaa.com%2Fwww%2Fattachment%2Fforum%2F201502%2F06%2F153734osoox1ow14tosgzp.jpg";
        String url = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490347504209&di=f6bd1e94c89712f1876df5e36e8f92fe&imgtype=0&src=http%3A%2F%2Fimg.elife.com%2Fforum%2F201411%2F03%2F113034p9rrtuxk8zbzp6zr.jpg";
        ImageLoader.loadBigImage(imageView,url5);
    }
}
