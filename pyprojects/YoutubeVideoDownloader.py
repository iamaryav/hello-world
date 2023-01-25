from pytube import YouTube


def download_youtube_video(link):
    yt = YouTube(link)
    yt.streams.filter(progressive=True, file_extension='mp4').order_by(
        'resolution').desc().first().download()


LINK = "your_link_here"
download_youtube_video(LINK)
